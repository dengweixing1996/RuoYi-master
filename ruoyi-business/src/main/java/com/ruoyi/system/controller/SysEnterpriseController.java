package com.ruoyi.system.controller;

import java.util.Date;
import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.domain.SysEnterpriseMove;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysEnterprise;
import com.ruoyi.system.service.ISysEnterpriseService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 企业信息Controller
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Controller
@RequestMapping("/system/enterprise")
public class SysEnterpriseController extends BaseController
{
    private String prefix = "system/enterprise";

    @Autowired
    private ISysEnterpriseService sysEnterpriseService;

    @RequiresPermissions("system:enterprise:view")
    @GetMapping()
    public String enterprise()
    {
        return prefix + "/enterprise";
    }

    /**
     * 查询企业信息列表
     */
    @RequiresPermissions("system:enterprise:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysEnterprise sysEnterprise)
    {
        startPage();
        List<SysEnterprise> list = sysEnterpriseService.selectSysEnterpriseList(sysEnterprise);
        return getDataTable(list);
    }

    /**
     * 导出企业信息列表
     */
    @RequiresPermissions("system:enterprise:export")
    @Log(title = "企业信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysEnterprise sysEnterprise)
    {
        List<SysEnterprise> list = sysEnterpriseService.selectSysEnterpriseList(sysEnterprise);
        ExcelUtil<SysEnterprise> util = new ExcelUtil<SysEnterprise>(SysEnterprise.class);
        return util.exportExcel(list, "企业信息数据");
    }

    /**
     * 新增企业信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业信息
     */
    @RequiresPermissions("system:enterprise:add")
    @Log(title = "企业信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysEnterprise sysEnterprise)
    {
        return toAjax(sysEnterpriseService.insertSysEnterprise(sysEnterprise));
    }

    /**
     * 修改企业信息
     */
    @RequiresPermissions("system:enterprise:edit")
    @GetMapping("/edit/{enterpriseId}")
    public String edit(@PathVariable("enterpriseId") Long enterpriseId, ModelMap mmap)
    {
        SysEnterprise sysEnterprise = sysEnterpriseService.selectSysEnterpriseByEnterpriseId(enterpriseId);
        mmap.put("sysEnterprise", sysEnterprise);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业信息
     */
    @RequiresPermissions("system:enterprise:edit")
    @Log(title = "企业信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysEnterprise sysEnterprise)
    {
        return toAjax(sysEnterpriseService.updateSysEnterprise(sysEnterprise));
    }

    /**
     * 删除企业信息
     */
    @RequiresPermissions("system:enterprise:remove")
    @Log(title = "企业信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysEnterpriseService.deleteSysEnterpriseByEnterpriseIds(ids));
    }
    /**迁出企业信息**/
    @RequiresPermissions("system:enterprise:moveOut")
    @Log(title = "企业信息", businessType = BusinessType.UPDATE)
    @PostMapping("/moveOut")
    @ResponseBody
    public AjaxResult moveOut(@RequestBody SysEnterpriseMove enterpriseMove)
    {

        return toAjax(sysEnterpriseService.moveOutEnterpriseById(enterpriseMove));
    }
    /**企业信息导入**/
    @Log(title = "企业信息", businessType = BusinessType.IMPORT)
    @RequiresPermissions("system:enterprise:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<SysEnterprise> util = new ExcelUtil<SysEnterprise>(SysEnterprise.class);
        List<SysEnterprise> enterpriseList = util.importExcel(file.getInputStream());
        String message = sysEnterpriseService.importEnterprise(enterpriseList, updateSupport, getLoginName());
        return AjaxResult.success(message);
    }

    @RequiresPermissions("system:user:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<SysEnterprise> util = new ExcelUtil<SysEnterprise>(SysEnterprise.class);
        return util.importTemplateExcel("企业数据");
    }


}
