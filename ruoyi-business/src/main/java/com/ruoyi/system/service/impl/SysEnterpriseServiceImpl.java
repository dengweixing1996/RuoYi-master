package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.SysEnterpriseMove;
import com.ruoyi.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysEnterpriseMapper;
import com.ruoyi.system.domain.SysEnterprise;
import com.ruoyi.system.service.ISysEnterpriseService;
import com.ruoyi.common.core.text.Convert;

/**
 * 企业信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Service
public class SysEnterpriseServiceImpl implements ISysEnterpriseService 
{
    @Autowired
    private SysEnterpriseMapper sysEnterpriseMapper;
    @Autowired
    private ISysConfigService configService;
    /**
     * 查询企业信息
     * 
     * @param enterpriseId 企业信息主键
     * @return 企业信息
     */
    @Override
    public SysEnterprise selectSysEnterpriseByEnterpriseId(Long enterpriseId)
    {
        return sysEnterpriseMapper.selectSysEnterpriseByEnterpriseId(enterpriseId);
    }

    /**
     * 查询企业信息列表
     * 
     * @param sysEnterprise 企业信息
     * @return 企业信息
     */
    @Override
    public List<SysEnterprise> selectSysEnterpriseList(SysEnterprise sysEnterprise)
    {
        return sysEnterpriseMapper.selectSysEnterpriseList(sysEnterprise);
    }

    /**
     * 新增企业信息
     * 
     * @param sysEnterprise 企业信息
     * @return 结果
     */
    @Override
    public int insertSysEnterprise(SysEnterprise sysEnterprise)
    {
        return sysEnterpriseMapper.insertSysEnterprise(sysEnterprise);
    }

    /**
     * 修改企业信息
     * 
     * @param sysEnterprise 企业信息
     * @return 结果
     */
    @Override
    public int updateSysEnterprise(SysEnterprise sysEnterprise)
    {
        return sysEnterpriseMapper.updateSysEnterprise(sysEnterprise);
    }

    /**
     * 批量删除企业信息
     * 
     * @param enterpriseIds 需要删除的企业信息主键
     * @return 结果
     */
    @Override
    public int deleteSysEnterpriseByEnterpriseIds(String enterpriseIds)
    {
        return sysEnterpriseMapper.deleteSysEnterpriseByEnterpriseIds(Convert.toStrArray(enterpriseIds));
    }

    /**
     * 删除企业信息信息
     * 
     * @param enterpriseId 企业信息主键
     * @return 结果
     */
    @Override
    public int deleteSysEnterpriseByEnterpriseId(Long enterpriseId)
    {
        return sysEnterpriseMapper.deleteSysEnterpriseByEnterpriseId(enterpriseId);
    }


    /**
     * 迁出企业信息
     *
     * @param enterpriseMove 企业信息主键
     * @return 结果
     */
    @Override
    public int moveOutEnterpriseById(SysEnterpriseMove enterpriseMove) {

        sysEnterpriseMapper.moveOutEnterpriseById(enterpriseMove);
        return sysEnterpriseMapper.deleteSysEnterpriseByEnterpriseId(enterpriseMove.getEnterpriseId());
    }

    public String importEnterprise(List<SysEnterprise> enterprisesList, Boolean isUpdateSupport, String operName){
        return "sss";
    }


}
