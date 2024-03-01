package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysRiskMapper;
import com.ruoyi.system.domain.SysRisk;
import com.ruoyi.system.service.ISysRiskService;
import com.ruoyi.common.core.text.Convert;

/**
 * 企业风险信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Service
public class SysRiskServiceImpl implements ISysRiskService 
{
    @Autowired
    private SysRiskMapper sysRiskMapper;

    /**
     * 查询企业风险信息
     * 
     * @param riskId 企业风险信息主键
     * @return 企业风险信息
     */
    @Override
    public SysRisk selectSysRiskByRiskId(Long riskId)
    {
        return sysRiskMapper.selectSysRiskByRiskId(riskId);
    }

    /**
     * 查询企业风险信息列表
     * 
     * @param sysRisk 企业风险信息
     * @return 企业风险信息
     */
    @Override
    public List<SysRisk> selectSysRiskList(SysRisk sysRisk)
    {
        return sysRiskMapper.selectSysRiskList(sysRisk);
    }

    /**
     * 新增企业风险信息
     * 
     * @param sysRisk 企业风险信息
     * @return 结果
     */
    @Override
    public int insertSysRisk(SysRisk sysRisk)
    {
        return sysRiskMapper.insertSysRisk(sysRisk);
    }

    /**
     * 修改企业风险信息
     * 
     * @param sysRisk 企业风险信息
     * @return 结果
     */
    @Override
    public int updateSysRisk(SysRisk sysRisk)
    {
        return sysRiskMapper.updateSysRisk(sysRisk);
    }

    /**
     * 批量删除企业风险信息
     * 
     * @param riskIds 需要删除的企业风险信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRiskByRiskIds(String riskIds)
    {
        return sysRiskMapper.deleteSysRiskByRiskIds(Convert.toStrArray(riskIds));
    }

    /**
     * 删除企业风险信息信息
     * 
     * @param riskId 企业风险信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRiskByRiskId(Long riskId)
    {
        return sysRiskMapper.deleteSysRiskByRiskId(riskId);
    }
}
