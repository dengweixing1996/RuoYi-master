package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 随手拍工单信息对象 sys_orders
 * 
 * @author ruoyi
 * @date 2024-02-29
 */
public class SysOrders extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工单编号 */
    private Long ordersId;

    /** 工单类型(0安全工单 1环保工单 2城市治理工单) */
    @Excel(name = "工单类型(0安全工单 1环保工单 2城市治理工单)")
    private String ordersType;

    /** 问题区域 */
    @Excel(name = "问题区域")
    private String ordersProblemarea;

    /** 问题名称 */
    @Excel(name = "问题名称")
    private String ordersName;

    /** 问题描述 */
    @Excel(name = "问题描述")
    private String ordersDescription;

    /** 问题照片路径 */
    @Excel(name = "问题照片路径")
    private String ordersPhotopath;

    /** 所属片区 */
    @Excel(name = "所属片区")
    private String ordersArea;

    /** 所属网格 */
    @Excel(name = "所属网格")
    private String ordersGrid;

    /** 发现时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发现时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ordersFindtime;

    /** 是否上报(0上报 1不上报) */
    @Excel(name = "是否上报(0上报 1不上报)")
    private String ordersSfsb;

    /** 登记人姓名 */
    @Excel(name = "登记人姓名")
    private String ordersRegisname;

    /** 派发状态(0已派发 1未派发) */
    @Excel(name = "派发状态(0已派发 1未派发)")
    private String ordersStatus;

    /** 处理状态(0已处理 1未处理) */
    @Excel(name = "处理状态(0已处理 1未处理)")
    private String ordersProcessingStatus;

    /** 当前办理人 */
    @Excel(name = "当前办理人")
    private String ordersHandler;

    /** 已超天数 */
    @Excel(name = "已超天数")
    private Long ordersDays;

    /** GPS定位地址 */
    @Excel(name = "GPS定位地址")
    private String ordersGps;

    public void setOrdersId(Long ordersId) 
    {
        this.ordersId = ordersId;
    }

    public Long getOrdersId() 
    {
        return ordersId;
    }
    public void setOrdersType(String ordersType) 
    {
        this.ordersType = ordersType;
    }

    public String getOrdersType() 
    {
        return ordersType;
    }
    public void setOrdersProblemarea(String ordersProblemarea) 
    {
        this.ordersProblemarea = ordersProblemarea;
    }

    public String getOrdersProblemarea() 
    {
        return ordersProblemarea;
    }
    public void setOrdersName(String ordersName) 
    {
        this.ordersName = ordersName;
    }

    public String getOrdersName() 
    {
        return ordersName;
    }
    public void setOrdersDescription(String ordersDescription) 
    {
        this.ordersDescription = ordersDescription;
    }

    public String getOrdersDescription() 
    {
        return ordersDescription;
    }
    public void setOrdersPhotopath(String ordersPhotopath) 
    {
        this.ordersPhotopath = ordersPhotopath;
    }

    public String getOrdersPhotopath() 
    {
        return ordersPhotopath;
    }
    public void setOrdersArea(String ordersArea) 
    {
        this.ordersArea = ordersArea;
    }

    public String getOrdersArea() 
    {
        return ordersArea;
    }
    public void setOrdersGrid(String ordersGrid) 
    {
        this.ordersGrid = ordersGrid;
    }

    public String getOrdersGrid() 
    {
        return ordersGrid;
    }
    public void setOrdersFindtime(Date ordersFindtime) 
    {
        this.ordersFindtime = ordersFindtime;
    }

    public Date getOrdersFindtime() 
    {
        return ordersFindtime;
    }
    public void setOrdersSfsb(String ordersSfsb) 
    {
        this.ordersSfsb = ordersSfsb;
    }

    public String getOrdersSfsb() 
    {
        return ordersSfsb;
    }
    public void setOrdersRegisname(String ordersRegisname) 
    {
        this.ordersRegisname = ordersRegisname;
    }

    public String getOrdersRegisname() 
    {
        return ordersRegisname;
    }
    public void setOrdersStatus(String ordersStatus) 
    {
        this.ordersStatus = ordersStatus;
    }

    public String getOrdersStatus() 
    {
        return ordersStatus;
    }
    public void setOrdersProcessingStatus(String ordersProcessingStatus) 
    {
        this.ordersProcessingStatus = ordersProcessingStatus;
    }

    public String getOrdersProcessingStatus() 
    {
        return ordersProcessingStatus;
    }
    public void setOrdersHandler(String ordersHandler) 
    {
        this.ordersHandler = ordersHandler;
    }

    public String getOrdersHandler() 
    {
        return ordersHandler;
    }
    public void setOrdersDays(Long ordersDays) 
    {
        this.ordersDays = ordersDays;
    }

    public Long getOrdersDays() 
    {
        return ordersDays;
    }
    public void setOrdersGps(String ordersGps) 
    {
        this.ordersGps = ordersGps;
    }

    public String getOrdersGps() 
    {
        return ordersGps;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ordersId", getOrdersId())
            .append("ordersType", getOrdersType())
            .append("ordersProblemarea", getOrdersProblemarea())
            .append("ordersName", getOrdersName())
            .append("ordersDescription", getOrdersDescription())
            .append("ordersPhotopath", getOrdersPhotopath())
            .append("ordersArea", getOrdersArea())
            .append("ordersGrid", getOrdersGrid())
            .append("ordersFindtime", getOrdersFindtime())
            .append("ordersSfsb", getOrdersSfsb())
            .append("ordersRegisname", getOrdersRegisname())
            .append("ordersStatus", getOrdersStatus())
            .append("ordersProcessingStatus", getOrdersProcessingStatus())
            .append("ordersHandler", getOrdersHandler())
            .append("ordersDays", getOrdersDays())
            .append("ordersGps", getOrdersGps())
            .toString();
    }
}
