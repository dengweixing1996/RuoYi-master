package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.domain.SysEnterprise;
import com.ruoyi.system.domain.SysEnterpriseMove;

/**
 * 企业信息Service接口
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public interface ISysEnterpriseService 
{
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
     * 批量删除企业信息
     * 
     * @param enterpriseIds 需要删除的企业信息主键集合
     * @return 结果
     */
    public int deleteSysEnterpriseByEnterpriseIds(String enterpriseIds);

    /**
     * 删除企业信息信息
     * 
     * @param enterpriseId 企业信息主键
     * @return 结果
     */
    public int deleteSysEnterpriseByEnterpriseId(Long enterpriseId);

    /**迁出企业信息**/
    public int moveOutEnterpriseById(SysEnterpriseMove enterpriseId);

    /**
     * 导入企业数据
     *
     * @param enterprisesList 企业数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    public String importEnterprise(List<SysEnterprise> enterprisesList, Boolean isUpdateSupport, String operName);



}
