package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysEnterpriseMove;

/**
 * 企业迁出信息Service接口
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public interface ISysEnterpriseMoveService 
{
    /**
     * 查询企业迁出信息
     * 
     * @param moveId 企业迁出信息主键
     * @return 企业迁出信息
     */
    public SysEnterpriseMove selectSysEnterpriseMoveByMoveId(Long moveId);

    /**
     * 查询企业迁出信息列表
     * 
     * @param sysEnterpriseMove 企业迁出信息
     * @return 企业迁出信息集合
     */
    public List<SysEnterpriseMove> selectSysEnterpriseMoveList(SysEnterpriseMove sysEnterpriseMove);

    /**
     * 新增企业迁出信息
     * 
     * @param sysEnterpriseMove 企业迁出信息
     * @return 结果
     */
    public int insertSysEnterpriseMove(SysEnterpriseMove sysEnterpriseMove);

    /**
     * 修改企业迁出信息
     * 
     * @param sysEnterpriseMove 企业迁出信息
     * @return 结果
     */
    public int updateSysEnterpriseMove(SysEnterpriseMove sysEnterpriseMove);

    /**
     * 批量删除企业迁出信息
     * 
     * @param moveIds 需要删除的企业迁出信息主键集合
     * @return 结果
     */
    public int deleteSysEnterpriseMoveByMoveIds(String moveIds);

    /**
     * 删除企业迁出信息信息
     * 
     * @param moveId 企业迁出信息主键
     * @return 结果
     */
    public int deleteSysEnterpriseMoveByMoveId(Long moveId);
}
