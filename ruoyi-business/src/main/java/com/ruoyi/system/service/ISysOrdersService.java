package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysOrders;

/**
 * 随手拍工单信息Service接口
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public interface ISysOrdersService 
{
    /**
     * 查询随手拍工单信息
     * 
     * @param ordersId 随手拍工单信息主键
     * @return 随手拍工单信息
     */
    public SysOrders selectSysOrdersByOrdersId(Long ordersId);

    /**
     * 查询随手拍工单信息列表
     * 
     * @param sysOrders 随手拍工单信息
     * @return 随手拍工单信息集合
     */
    public List<SysOrders> selectSysOrdersList(SysOrders sysOrders);

    /**
     * 新增随手拍工单信息
     * 
     * @param sysOrders 随手拍工单信息
     * @return 结果
     */
    public int insertSysOrders(SysOrders sysOrders);

    /**
     * 修改随手拍工单信息
     * 
     * @param sysOrders 随手拍工单信息
     * @return 结果
     */
    public int updateSysOrders(SysOrders sysOrders);

    /**
     * 批量删除随手拍工单信息
     * 
     * @param ordersIds 需要删除的随手拍工单信息主键集合
     * @return 结果
     */
    public int deleteSysOrdersByOrdersIds(String ordersIds);

    /**
     * 删除随手拍工单信息信息
     * 
     * @param ordersId 随手拍工单信息主键
     * @return 结果
     */
    public int deleteSysOrdersByOrdersId(Long ordersId);
}
