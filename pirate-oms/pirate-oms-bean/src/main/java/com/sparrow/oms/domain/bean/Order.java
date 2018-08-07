package com.sparrow.oms.domain.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author Jack
 * @since 2018-08-07
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Order对象", description = "订单表")
@TableName("t_order")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "订单ID", name = "id")
    private Long id;
    /**
     * 订单编码
     */
    @TableField("order_code")
    @ApiModelProperty(value = "订单编码", name = "orderCode")
    private String orderCode;
    /**
     * 业务归属节点编码, 业务组织结构编码
     */
    @TableField("service_node_id")
    @ApiModelProperty(value = "业务归属节点编码, 业务组织结构编码", name = "serviceNodeId")
    private String serviceNodeId;
    /**
     * 销售方, 销售方式供应商的客户ID, t_goods_supplier.id
     */
    @TableField("supplier_id")
    @ApiModelProperty(value = "销售方, 销售方式供应商的客户ID, t_goods_supplier.id", name = "supplierId")
    private Long supplierId;
    /**
     * 采购方，采购方是商品客户ID,支持多个 t_goods_customer.id
     */
    @TableField("cust_ids")
    @ApiModelProperty(value = "采购方，采购方是商品客户ID,支持多个 t_goods_customer.id", name = "custIds")
    private String custIds;
    /**
     * 单据日期，格式YYYY-MM-DD
     */
    @TableField("doc_date")
    @ApiModelProperty(value = "单据日期，格式YYYY-MM-DD", name = "docDate")
    private LocalDate docDate;
    /**
     * 交货日期，格式YYYY-MM-DD
     */
    @TableField("delivery_date")
    @ApiModelProperty(value = "交货日期，格式YYYY-MM-DD", name = "deliveryDate")
    private LocalDate deliveryDate;
    /**
     * 业务员
     */
    @ApiModelProperty(value = "业务员", name = "clerk")
    private String clerk;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", name = "status")
    private Integer status;
    /**
     * 删除标识，默认为0，标识不删除
     */
    @TableField("delete_flag")
    @ApiModelProperty(value = "删除标识，默认为0，标识不删除", name = "deleteFlag")
    private String deleteFlag;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;
    /**
     * 终端源, 0 PC web, 1 手机web, 2 微信公众号, 3 小程序，4 android, 5 iOS, 6, api接入
     */
    @TableField("create_terminal_source")
    @ApiModelProperty(value = "终端源, 0 PC web, 1 手机web, 2 微信公众号, 3 小程序，4 android, 5 iOS, 6, api接入", name = "createTerminalSource")
    private Integer createTerminalSource;
    /**
     * 创建人
     */
    @TableField("create_by")
    @ApiModelProperty(value = "创建人", name = "createBy")
    private Long createBy;
    /**
     * 修改人
     */
    @TableField("update_by")
    @ApiModelProperty(value = "修改人", name = "updateBy")
    private Long updateBy;
    /**
     * 创建时间
     */
    @TableField("create_time")
    @ApiModelProperty(value = "创建时间", name = "createTime")
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    @ApiModelProperty(value = "修改时间", name = "updateTime")
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
