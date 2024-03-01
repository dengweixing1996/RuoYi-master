package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysEnterpriseMoveMapper;
import com.ruoyi.system.domain.SysEnterpriseMove;
import com.ruoyi.system.service.ISysEnterpriseMoveService;
import com.ruoyi.common.core.text.Convert;

/**
 * 企业迁出信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Service
public class SysEnterpriseMoveServiceImpl implements ISysEnterpriseMoveService 
{
    @Autowired
    private SysEnterpriseMoveMapper sysEnterpriseMoveMapper;

    /**
     * 查询企业迁出信息
     * 
     * @param moveId 企业迁出信息主键
     * @return 企业迁出信息
     */
    @Override
    public SysEnterpriseMove selectSysEnterpriseMoveByMoveId(Long moveId)
    {
        return sysEnterpriseMoveMapper.selectSysEnterpriseMoveByMoveId(moveId);
    }

    /**
     * 查询企业迁出信息列表
     * 
     * @param sysEnterpriseMove 企业迁出信息
     * @return 企业迁出信息
     */
    @Override
    public List<SysEnterpriseMove> selectSysEnterpriseMoveList(SysEnterpriseMove sysEnterpriseMove)
    {
        return sysEnterpriseMoveMapper.selectSysEnterpriseMoveList(sysEnterpriseMove);
    }

    /**
     * 新增企业迁出信息
     * 
     * @param sysEnterpriseMove 企业迁出信息
     * @return 结果
     */
    @Override
    public int insertSysEnterpriseMove(SysEnterpriseMove sysEnterpriseMove)
    {
        return sysEnterpriseMoveMapper.insertSysEnterpriseMove(sysEnterpriseMove);
    }

    /**
     * 修改企业迁出信息
     * 
     * @param sysEnterpriseMove 企业迁出信息
     * @return 结果
     */
    @Override
    public int updateSysEnterpriseMove(SysEnterpriseMove sysEnterpriseMove)
    {
        return sysEnterpriseMoveMapper.updateSysEnterpriseMove(sysEnterpriseMove);
    }

    /**
     * 批量删除企业迁出信息
     * 
     * @param moveIds 需要删除的企业迁出信息主键
     * @return 结果
     */
    @Override
    public int deleteSysEnterpriseMoveByMoveIds(String moveIds)
    {
        return sysEnterpriseMoveMapper.deleteSysEnterpriseMoveByMoveIds(Convert.toStrArray(moveIds));
    }

    /**
     * 删除企业迁出信息信息
     * 
     * @param moveId 企业迁出信息主键
     * @return 结果
     */
    @Override
    public int deleteSysEnterpriseMoveByMoveId(Long moveId)
    {
        return sysEnterpriseMoveMapper.deleteSysEnterpriseMoveByMoveId(moveId);
    }
}
