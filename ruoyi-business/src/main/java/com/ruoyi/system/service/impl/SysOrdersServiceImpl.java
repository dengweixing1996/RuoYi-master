package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysOrdersMapper;
import com.ruoyi.system.domain.SysOrders;
import com.ruoyi.system.service.ISysOrdersService;
import com.ruoyi.common.core.text.Convert;

/**
 * 随手拍工单信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Service
public class SysOrdersServiceImpl implements ISysOrdersService 
{
    @Autowired
    private SysOrdersMapper sysOrdersMapper;

    /**
     * 查询随手拍工单信息
     * 
     * @param ordersId 随手拍工单信息主键
     * @return 随手拍工单信息
     */
    @Override
    public SysOrders selectSysOrdersByOrdersId(Long ordersId)
    {
        return sysOrdersMapper.selectSysOrdersByOrdersId(ordersId);
    }

    /**
     * 查询随手拍工单信息列表
     * 
     * @param sysOrders 随手拍工单信息
     * @return 随手拍工单信息
     */
    @Override
    public List<SysOrders> selectSysOrdersList(SysOrders sysOrders)
    {
        return sysOrdersMapper.selectSysOrdersList(sysOrders);
    }

    /**
     * 新增随手拍工单信息
     * 
     * @param sysOrders 随手拍工单信息
     * @return 结果
     */
    @Override
    public int insertSysOrders(SysOrders sysOrders)
    {
        return sysOrdersMapper.insertSysOrders(sysOrders);
    }

    /**
     * 修改随手拍工单信息
     * 
     * @param sysOrders 随手拍工单信息
     * @return 结果
     */
    @Override
    public int updateSysOrders(SysOrders sysOrders)
    {
        return sysOrdersMapper.updateSysOrders(sysOrders);
    }

    /**
     * 批量删除随手拍工单信息
     * 
     * @param ordersIds 需要删除的随手拍工单信息主键
     * @return 结果
     */
    @Override
    public int deleteSysOrdersByOrdersIds(String ordersIds)
    {
        return sysOrdersMapper.deleteSysOrdersByOrdersIds(Convert.toStrArray(ordersIds));
    }

    /**
     * 删除随手拍工单信息信息
     * 
     * @param ordersId 随手拍工单信息主键
     * @return 结果
     */
    @Override
    public int deleteSysOrdersByOrdersId(Long ordersId)
    {
        return sysOrdersMapper.deleteSysOrdersByOrdersId(ordersId);
    }
}
