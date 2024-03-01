package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业风险信息对象 sys_risk
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public class SysRisk extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 风险编号 */
    private Long riskId;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private Long enterpriseId;

    /** 风险所在位置 */
    @Excel(name = "风险所在位置")
    private String riskArea;

    /** 管理类别 */
    @Excel(name = "管理类别")
    private String riskType;

    /** 风险代码 */
    @Excel(name = "风险代码")
    private String riskCode;

    /** 风险名称 */
    @Excel(name = "风险名称")
    private String riskName;

    /** 主要事故类别 */
    @Excel(name = "主要事故类别")
    private String riskAccident;

    /** 风险点 */
    @Excel(name = "风险点")
    private String riskPoint;

    /** 管控措施 */
    @Excel(name = "管控措施")
    private String riskControl;

    public void setRiskId(Long riskId) 
    {
        this.riskId = riskId;
    }

    public Long getRiskId() 
    {
        return riskId;
    }
    public void setEnterpriseId(Long enterpriseId) 
    {
        this.enterpriseId = enterpriseId;
    }

    public Long getEnterpriseId() 
    {
        return enterpriseId;
    }
    public void setRiskArea(String riskArea) 
    {
        this.riskArea = riskArea;
    }

    public String getRiskArea() 
    {
        return riskArea;
    }
    public void setRiskType(String riskType) 
    {
        this.riskType = riskType;
    }

    public String getRiskType() 
    {
        return riskType;
    }
    public void setRiskCode(String riskCode) 
    {
        this.riskCode = riskCode;
    }

    public String getRiskCode() 
    {
        return riskCode;
    }
    public void setRiskName(String riskName) 
    {
        this.riskName = riskName;
    }

    public String getRiskName() 
    {
        return riskName;
    }
    public void setRiskAccident(String riskAccident) 
    {
        this.riskAccident = riskAccident;
    }

    public String getRiskAccident() 
    {
        return riskAccident;
    }
    public void setRiskPoint(String riskPoint) 
    {
        this.riskPoint = riskPoint;
    }

    public String getRiskPoint() 
    {
        return riskPoint;
    }
    public void setRiskControl(String riskControl) 
    {
        this.riskControl = riskControl;
    }

    public String getRiskControl() 
    {
        return riskControl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("riskId", getRiskId())
            .append("enterpriseId", getEnterpriseId())
            .append("riskArea", getRiskArea())
            .append("riskType", getRiskType())
            .append("riskCode", getRiskCode())
            .append("riskName", getRiskName())
            .append("riskAccident", getRiskAccident())
            .append("riskPoint", getRiskPoint())
            .append("riskControl", getRiskControl())
            .toString();
    }
}
