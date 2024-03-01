package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysEnterpriseMove;
import com.ruoyi.system.service.ISysEnterpriseMoveService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 企业迁出信息Controller
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Controller
@RequestMapping("/system/move")
public class SysEnterpriseMoveController extends BaseController
{
    private String prefix = "system/move";

    @Autowired
    private ISysEnterpriseMoveService sysEnterpriseMoveService;

    @RequiresPermissions("system:move:view")
    @GetMapping()
    public String move()
    {
        return prefix + "/move";
    }

    /**
     * 查询企业迁出信息列表
     */
    @RequiresPermissions("system:move:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysEnterpriseMove sysEnterpriseMove)
    {
        startPage();
        List<SysEnterpriseMove> list = sysEnterpriseMoveService.selectSysEnterpriseMoveList(sysEnterpriseMove);
        return getDataTable(list);
    }

    /**
     * 导出企业迁出信息列表
     */
    @RequiresPermissions("system:move:export")
    @Log(title = "企业迁出信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysEnterpriseMove sysEnterpriseMove)
    {
        List<SysEnterpriseMove> list = sysEnterpriseMoveService.selectSysEnterpriseMoveList(sysEnterpriseMove);
        ExcelUtil<SysEnterpriseMove> util = new ExcelUtil<SysEnterpriseMove>(SysEnterpriseMove.class);
        return util.exportExcel(list, "企业迁出信息数据");
    }

    /**
     * 新增企业迁出信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业迁出信息
     */
    @RequiresPermissions("system:move:add")
    @Log(title = "企业迁出信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysEnterpriseMove sysEnterpriseMove)
    {
        return toAjax(sysEnterpriseMoveService.insertSysEnterpriseMove(sysEnterpriseMove));
    }

    /**
     * 修改企业迁出信息
     */
    @RequiresPermissions("system:move:edit")
    @GetMapping("/edit/{moveId}")
    public String edit(@PathVariable("moveId") Long moveId, ModelMap mmap)
    {
        SysEnterpriseMove sysEnterpriseMove = sysEnterpriseMoveService.selectSysEnterpriseMoveByMoveId(moveId);
        mmap.put("sysEnterpriseMove", sysEnterpriseMove);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业迁出信息
     */
    @RequiresPermissions("system:move:edit")
    @Log(title = "企业迁出信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysEnterpriseMove sysEnterpriseMove)
    {
        return toAjax(sysEnterpriseMoveService.updateSysEnterpriseMove(sysEnterpriseMove));
    }

    /**
     * 删除企业迁出信息
     */
    @RequiresPermissions("system:move:remove")
    @Log(title = "企业迁出信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysEnterpriseMoveService.deleteSysEnterpriseMoveByMoveIds(ids));
    }
}
