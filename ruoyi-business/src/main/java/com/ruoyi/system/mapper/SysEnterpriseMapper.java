package com.ruoyi.system.mapper;

import java.util.Date;
import java.util.List;
import com.ruoyi.system.domain.SysEnterprise;
import com.ruoyi.system.domain.SysEnterpriseMove;

/**
 * 企业信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public interface SysEnterpriseMapper 
{
    SysEnterprise selectEnterpriseByName(String enterpriseName);

    /**
     * 查询企业信息
     * 
     * @param enterpriseId 企业信息主键
     * @return 企业信息
     */
    public SysEnterprise selectSysEnterpriseByEnterpriseId(Long enterpriseId);

    /**
     * 查询企业信息列表
     * 
     * @param sysEnterprise 企业信息
     * @return 企业信息集合
     */
    public List<SysEnterprise> selectSysEnterpriseList(SysEnterprise sysEnterprise);



    /**
     * 新增企业信息
     * 
     * @param sysEnterprise 企业信息
     * @return 结果
     */
    public int insertSysEnterprise(SysEnterprise sysEnterprise);

    /**
     * 修改企业信息
     * 
     * @param sysEnterprise 企业信息
     * @return 结果
     */
    public int updateSysEnterprise(SysEnterprise sysEnterprise);



    /**
     * 删除企业信息
     * 
     * @param enterpriseId 企业信息主键
     * @return 结果
     */
    public int deleteSysEnterpriseByEnterpriseId(Long enterpriseId);

    /**
     * 批量删除企业信息
     * 
     * @param enterpriseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysEnterpriseByEnterpriseIds(String[] enterpriseIds);

    public int moveOutEnterpriseById(SysEnterpriseMove enterpriseMove);
}
