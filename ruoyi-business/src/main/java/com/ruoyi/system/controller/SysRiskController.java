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
import com.ruoyi.system.domain.SysRisk;
import com.ruoyi.system.service.ISysRiskService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 企业风险信息Controller
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Controller
@RequestMapping("/system/risk")
public class SysRiskController extends BaseController
{
    private String prefix = "system/risk";

    @Autowired
    private ISysRiskService sysRiskService;

    @RequiresPermissions("system:risk:view")
    @GetMapping()
    public String risk()
    {
        return prefix + "/risk";
    }

    /**
     * 查询企业风险信息列表
     */
    @RequiresPermissions("system:risk:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysRisk sysRisk)
    {
        startPage();
        List<SysRisk> list = sysRiskService.selectSysRiskList(sysRisk);
        return getDataTable(list);
    }

    /**
     * 导出企业风险信息列表
     */
    @RequiresPermissions("system:risk:export")
    @Log(title = "企业风险信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysRisk sysRisk)
    {
        List<SysRisk> list = sysRiskService.selectSysRiskList(sysRisk);
        ExcelUtil<SysRisk> util = new ExcelUtil<SysRisk>(SysRisk.class);
        return util.exportExcel(list, "企业风险信息数据");
    }

    /**
     * 新增企业风险信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业风险信息
     */
    @RequiresPermissions("system:risk:add")
    @Log(title = "企业风险信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysRisk sysRisk)
    {
        return toAjax(sysRiskService.insertSysRisk(sysRisk));
    }

    /**
     * 修改企业风险信息
     */
    @RequiresPermissions("system:risk:edit")
    @GetMapping("/edit/{riskId}")
    public String edit(@PathVariable("riskId") Long riskId, ModelMap mmap)
    {
        SysRisk sysRisk = sysRiskService.selectSysRiskByRiskId(riskId);
        mmap.put("sysRisk", sysRisk);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业风险信息
     */
    @RequiresPermissions("system:risk:edit")
    @Log(title = "企业风险信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysRisk sysRisk)
    {
        return toAjax(sysRiskService.updateSysRisk(sysRisk));
    }

    /**
     * 删除企业风险信息
     */
    @RequiresPermissions("system:risk:remove")
    @Log(title = "企业风险信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysRiskService.deleteSysRiskByRiskIds(ids));
    }
}
