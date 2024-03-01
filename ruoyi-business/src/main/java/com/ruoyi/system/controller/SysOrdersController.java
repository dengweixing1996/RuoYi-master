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
import com.ruoyi.system.domain.SysOrders;
import com.ruoyi.system.service.ISysOrdersService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 随手拍工单信息Controller
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Controller
@RequestMapping("/system/orders")
public class SysOrdersController extends BaseController
{
    private String prefix = "system/orders";

    @Autowired
    private ISysOrdersService sysOrdersService;

    @RequiresPermissions("system:orders:view")
    @GetMapping()
    public String orders()
    {
        return prefix + "/orders";
    }

    /**
     * 查询随手拍工单信息列表
     */
    @RequiresPermissions("system:orders:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysOrders sysOrders)
    {
        startPage();
        List<SysOrders> list = sysOrdersService.selectSysOrdersList(sysOrders);
        return getDataTable(list);
    }

    /**
     * 导出随手拍工单信息列表
     */
    @RequiresPermissions("system:orders:export")
    @Log(title = "随手拍工单信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysOrders sysOrders)
    {
        List<SysOrders> list = sysOrdersService.selectSysOrdersList(sysOrders);
        ExcelUtil<SysOrders> util = new ExcelUtil<SysOrders>(SysOrders.class);
        return util.exportExcel(list, "随手拍工单信息数据");
    }

    /**
     * 新增随手拍工单信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存随手拍工单信息
     */
    @RequiresPermissions("system:orders:add")
    @Log(title = "随手拍工单信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysOrders sysOrders)
    {
        return toAjax(sysOrdersService.insertSysOrders(sysOrders));
    }

    /**
     * 修改随手拍工单信息
     */
    @RequiresPermissions("system:orders:edit")
    @GetMapping("/edit/{ordersId}")
    public String edit(@PathVariable("ordersId") Long ordersId, ModelMap mmap)
    {
        SysOrders sysOrders = sysOrdersService.selectSysOrdersByOrdersId(ordersId);
        mmap.put("sysOrders", sysOrders);
        return prefix + "/edit";
    }

    /**
     * 修改保存随手拍工单信息
     */
    @RequiresPermissions("system:orders:edit")
    @Log(title = "随手拍工单信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysOrders sysOrders)
    {
        return toAjax(sysOrdersService.updateSysOrders(sysOrders));
    }

    /**
     * 删除随手拍工单信息
     */
    @RequiresPermissions("system:orders:remove")
    @Log(title = "随手拍工单信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysOrdersService.deleteSysOrdersByOrdersIds(ids));
    }


}
