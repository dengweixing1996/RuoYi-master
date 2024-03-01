package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业迁出信息对象 sys_enterprise_move
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public class SysEnterpriseMove extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 迁出编号 */
    private Long moveId;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private Long enterpriseId;

    /** 企业迁出日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "企业迁出日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date moveDate;

    /** 企业迁出原因 */
    @Excel(name = "企业迁出原因")
    private String moveReason;

    /** 企业迁出操作人 */
    @Excel(name = "企业迁出操作人")
    private String movePerson;

    public void setMoveId(Long moveId) 
    {
        this.moveId = moveId;
    }

    public Long getMoveId() 
    {
        return moveId;
    }
    public void setEnterpriseId(Long enterpriseId) 
    {
        this.enterpriseId = enterpriseId;
    }

    public Long getEnterpriseId() 
    {
        return enterpriseId;
    }
    public void setMoveDate(Date moveDate) 
    {
        this.moveDate = moveDate;
    }

    public Date getMoveDate() 
    {
        return moveDate;
    }
    public void setMoveReason(String moveReason) 
    {
        this.moveReason = moveReason;
    }

    public String getMoveReason() 
    {
        return moveReason;
    }
    public void setMovePerson(String movePerson) 
    {
        this.movePerson = movePerson;
    }

    public String getMovePerson() 
    {
        return movePerson;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("moveId", getMoveId())
            .append("enterpriseId", getEnterpriseId())
            .append("moveDate", getMoveDate())
            .append("moveReason", getMoveReason())
            .append("movePerson", getMovePerson())
            .toString();
    }
}
