package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRisk;

/**
 * 企业风险信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public interface SysRiskMapper 
{
    /**
     * 查询企业风险信息
     * 
     * @param riskId 企业风险信息主键
     * @return 企业风险信息
     */
    public SysRisk selectSysRiskByRiskId(Long riskId);

    /**
     * 查询企业风险信息列表
     * 
     * @param sysRisk 企业风险信息
     * @return 企业风险信息集合
     */
    public List<SysRisk> selectSysRiskList(SysRisk sysRisk);

    /**
     * 新增企业风险信息
     * 
     * @param sysRisk 企业风险信息
     * @return 结果
     */
    public int insertSysRisk(SysRisk sysRisk);

    /**
     * 修改企业风险信息
     * 
     * @param sysRisk 企业风险信息
     * @return 结果
     */
    public int updateSysRisk(SysRisk sysRisk);

    /**
     * 删除企业风险信息
     * 
     * @param riskId 企业风险信息主键
     * @return 结果
     */
    public int deleteSysRiskByRiskId(Long riskId);

    /**
     * 批量删除企业风险信息
     * 
     * @param riskIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysRiskByRiskIds(String[] riskIds);
}
