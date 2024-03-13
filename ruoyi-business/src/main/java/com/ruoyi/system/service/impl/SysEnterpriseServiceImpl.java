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
import com.ruoyi.common.utils.bean.BeanValidators;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 企业信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
@Service
public class SysEnterpriseServiceImpl implements ISysEnterpriseService 
{
    private static final Logger log = LoggerFactory.getLogger(SysEnterpriseServiceImpl.class);
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
    @Autowired
    protected Validator validator;
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

    /**
     * 导入企业数据
     *
     * @param enterprisesList 企业数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    @Override
    public String importEnterprise(List<SysEnterprise> enterprisesList, Boolean isUpdateSupport, String operName) {
        if (StringUtils.isNull(enterprisesList) || enterprisesList.isEmpty()) {
            throw new ServiceException("导入企业数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (SysEnterprise enterprise : enterprisesList) {
            try {
                // 正确地通过实例调用方法
                SysEnterprise e = sysEnterpriseMapper.selectEnterpriseByName(enterprise.getEnterpriseName());
                if (StringUtils.isNull(e)) {
                    BeanValidators.validateWithException(validator, enterprise);
                    enterprise.setCreateBy(operName);
                    sysEnterpriseMapper.insertSysEnterprise(enterprise); // 正确
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、企业 " + enterprise.getEnterpriseName() + " 导入成功");
                }
                else if (isUpdateSupport) {
                    BeanValidators.validateWithException(validator, enterprise);
                    enterprise.setEnterpriseId(e.getEnterpriseId());
                    enterprise.setUpdateBy(operName);
                    sysEnterpriseMapper.updateSysEnterprise(enterprise); // 正确
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、企业 " + enterprise.getEnterpriseName() + " 更新成功");
                } else {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、企业 " + enterprise.getEnterpriseName() + " 已存在");
                }
            } catch (Exception e) {
                failureNum++;
                String msg = "<br/>" + failureNum + "、企业 " + enterprise.getEnterpriseName() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0) {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        } else {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        System.out.println(successMsg);
        return successMsg.toString();
    }


}
