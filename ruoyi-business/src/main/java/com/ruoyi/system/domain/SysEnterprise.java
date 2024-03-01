package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业信息对象 sys_enterprise
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public class SysEnterprise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 企业编号 */
    private Long enterpriseId;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String enterpriseName;

    /** 所属片区（0中山 1高新 2桥北） */
   // @Excel(name = "所属片区", readConverterExp = "0=中山,1=高新,2=桥北")
    @Excel(name = "所属片区")
    private String enterpriseArea;

    /** 行业类别 */
    @Excel(name = "行业类别")
    private String enterpriseCategory;

    /** 经营类型 */
    @Excel(name = "经营类型")
    private String enterpriseType;

    /** 181平台类型（0企业面 1社会面） */
    @Excel(name = "181平台类型")
    private String enterprise181type;

    /** 是否规上企业（0是 1否） */
    @Excel(name = "是否规上企业")
    private String enterpriseGstype;

    /** 所属网格 */
    @Excel(name = "所属网格")
    private String enterpriseGrid;

    /** 产权类型 */
    @Excel(name = "产权类型")
    private String enterprisePropertytype;

    /** 实际经营地址 */
    @Excel(name = "实际经营地址")
    private String enterpriseAddress;

    /** 员工人数 */
    @Excel(name = "员工人数")
    private Long enterpriseNumber;

    /** 安全负责人 */
    @Excel(name = "安全负责人")
    private String enterpriseOfficer;

    /** 安全负责人电话 */
    @Excel(name = "安全负责人电话")
    private String enterpriseOfficerphone;

    /** 主要产品 */
    @Excel(name = "主要产品")
    private String enterpriseProducts;

    /** 是否有宿舍（0是 1否） */
    @Excel(name = "是否有宿舍")
    private String enterpriseDormitory;

    /** 宿舍面积 */
    @Excel(name = "宿舍面积")
    private BigDecimal enterpriseMianji;

    /** 是否有危化品（0是 1否） */
    @Excel(name = "是否有危化品")
    private String enterpriseHazardous;

    /** 是否有理化实验室（0是 1否） */
    @Excel(name = "是否有理化实验室")
    private String enterpriseLab;

    /** 燃气种类（0天然气 1液化气） */
    @Excel(name = "燃气种类")
    private String enterpriseGastype;

    /** 燃气使用类型（0餐饮 1生产） */
    @Excel(name = "燃气使用类型")
    private String enterpriseUsagetype;

    /** 危化品风险评级 */
    @Excel(name = "危化品风险评级")
    private String enterpriseRisklevel;

    /** 工业企业风险定级 */
    @Excel(name = "工业企业风险定级")
    private String enterpriseEnterpriseLevel;

    /** 特种作业类型 */
    @Excel(name = "特种作业类型")
    private String enterpriseTzzytype;

    public void setEnterpriseId(Long enterpriseId) 
    {
        this.enterpriseId = enterpriseId;
    }

    public Long getEnterpriseId() 
    {
        return enterpriseId;
    }
    public void setEnterpriseName(String enterpriseName) 
    {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseName() 
    {
        return enterpriseName;
    }
    public void setEnterpriseArea(String enterpriseArea) 
    {
        this.enterpriseArea = enterpriseArea;
    }

    public String getEnterpriseArea() 
    {
        return enterpriseArea;
    }
    public void setEnterpriseCategory(String enterpriseCategory) 
    {
        this.enterpriseCategory = enterpriseCategory;
    }

    public String getEnterpriseCategory() 
    {
        return enterpriseCategory;
    }
    public void setEnterpriseType(String enterpriseType) 
    {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseType() 
    {
        return enterpriseType;
    }
    public void setEnterprise181type(String enterprise181type) 
    {
        this.enterprise181type = enterprise181type;
    }

    public String getEnterprise181type() 
    {
        return enterprise181type;
    }
    public void setEnterpriseGstype(String enterpriseGstype) 
    {
        this.enterpriseGstype = enterpriseGstype;
    }

    public String getEnterpriseGstype() 
    {
        return enterpriseGstype;
    }
    public void setEnterpriseGrid(String enterpriseGrid) 
    {
        this.enterpriseGrid = enterpriseGrid;
    }

    public String getEnterpriseGrid() 
    {
        return enterpriseGrid;
    }
    public void setEnterprisePropertytype(String enterprisePropertytype) 
    {
        this.enterprisePropertytype = enterprisePropertytype;
    }

    public String getEnterprisePropertytype() 
    {
        return enterprisePropertytype;
    }
    public void setEnterpriseAddress(String enterpriseAddress) 
    {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseAddress() 
    {
        return enterpriseAddress;
    }
    public void setEnterpriseNumber(Long enterpriseNumber) 
    {
        this.enterpriseNumber = enterpriseNumber;
    }

    public Long getEnterpriseNumber() 
    {
        return enterpriseNumber;
    }
    public void setEnterpriseOfficer(String enterpriseOfficer) 
    {
        this.enterpriseOfficer = enterpriseOfficer;
    }

    public String getEnterpriseOfficer() 
    {
        return enterpriseOfficer;
    }
    public void setEnterpriseOfficerphone(String enterpriseOfficerphone) 
    {
        this.enterpriseOfficerphone = enterpriseOfficerphone;
    }

    public String getEnterpriseOfficerphone() 
    {
        return enterpriseOfficerphone;
    }
    public void setEnterpriseProducts(String enterpriseProducts) 
    {
        this.enterpriseProducts = enterpriseProducts;
    }

    public String getEnterpriseProducts() 
    {
        return enterpriseProducts;
    }
    public void setEnterpriseDormitory(String enterpriseDormitory) 
    {
        this.enterpriseDormitory = enterpriseDormitory;
    }

    public String getEnterpriseDormitory() 
    {
        return enterpriseDormitory;
    }
    public void setEnterpriseMianji(BigDecimal enterpriseMianji) 
    {
        this.enterpriseMianji = enterpriseMianji;
    }

    public BigDecimal getEnterpriseMianji() 
    {
        return enterpriseMianji;
    }
    public void setEnterpriseHazardous(String enterpriseHazardous) 
    {
        this.enterpriseHazardous = enterpriseHazardous;
    }

    public String getEnterpriseHazardous() 
    {
        return enterpriseHazardous;
    }
    public void setEnterpriseLab(String enterpriseLab) 
    {
        this.enterpriseLab = enterpriseLab;
    }

    public String getEnterpriseLab() 
    {
        return enterpriseLab;
    }
    public void setEnterpriseGastype(String enterpriseGastype) 
    {
        this.enterpriseGastype = enterpriseGastype;
    }

    public String getEnterpriseGastype() 
    {
        return enterpriseGastype;
    }
    public void setEnterpriseUsagetype(String enterpriseUsagetype) 
    {
        this.enterpriseUsagetype = enterpriseUsagetype;
    }

    public String getEnterpriseUsagetype() 
    {
        return enterpriseUsagetype;
    }
    public void setEnterpriseRisklevel(String enterpriseRisklevel) 
    {
        this.enterpriseRisklevel = enterpriseRisklevel;
    }

    public String getEnterpriseRisklevel() 
    {
        return enterpriseRisklevel;
    }
    public void setEnterpriseEnterpriseLevel(String enterpriseEnterpriseLevel) 
    {
        this.enterpriseEnterpriseLevel = enterpriseEnterpriseLevel;
    }

    public String getEnterpriseEnterpriseLevel() 
    {
        return enterpriseEnterpriseLevel;
    }
    public void setEnterpriseTzzytype(String enterpriseTzzytype) 
    {
        this.enterpriseTzzytype = enterpriseTzzytype;
    }

    public String getEnterpriseTzzytype() 
    {
        return enterpriseTzzytype;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("enterpriseId", getEnterpriseId())
            .append("enterpriseName", getEnterpriseName())
            .append("enterpriseArea", getEnterpriseArea())
            .append("enterpriseCategory", getEnterpriseCategory())
            .append("enterpriseType", getEnterpriseType())
            .append("enterprise181type", getEnterprise181type())
            .append("enterpriseGstype", getEnterpriseGstype())
            .append("enterpriseGrid", getEnterpriseGrid())
            .append("enterprisePropertytype", getEnterprisePropertytype())
            .append("enterpriseAddress", getEnterpriseAddress())
            .append("enterpriseNumber", getEnterpriseNumber())
            .append("enterpriseOfficer", getEnterpriseOfficer())
            .append("enterpriseOfficerphone", getEnterpriseOfficerphone())
            .append("enterpriseProducts", getEnterpriseProducts())
            .append("enterpriseDormitory", getEnterpriseDormitory())
            .append("enterpriseMianji", getEnterpriseMianji())
            .append("enterpriseHazardous", getEnterpriseHazardous())
            .append("enterpriseLab", getEnterpriseLab())
            .append("enterpriseGastype", getEnterpriseGastype())
            .append("enterpriseUsagetype", getEnterpriseUsagetype())
            .append("enterpriseRisklevel", getEnterpriseRisklevel())
            .append("enterpriseEnterpriseLevel", getEnterpriseEnterpriseLevel())
            .append("enterpriseTzzytype", getEnterpriseTzzytype())
            .toString();
    }
}
