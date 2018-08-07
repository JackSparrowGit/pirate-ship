package com.sparrow.oms.web.controller;

import com.github.pagehelper.PageInfo;
import com.sparrow.common.global.PagingRequest;
import com.sparrow.common.global.RespEntity;
import com.sparrow.oms.domain.bean.Order;
import com.sparrow.oms.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;


/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author Jack
 * @since 2018-08-07 ${time}
 */
@Api(value = "/orders", description = "订单表 接口; Responseble:Jack")
@RestController
@RequestMapping("/orders")
public class OrderController {

    /**
     * 订单ID  id  Long
     * <p>
     * 订单编码  orderCode  String
     * <p>
     * 业务归属节点编码, 业务组织结构编码  serviceNodeId  String
     * <p>
     * 销售方, 销售方式供应商的客户ID, t_goods_supplier.id  supplierId  Long
     * <p>
     * 采购方，采购方是商品客户ID,支持多个 t_goods_customer.id  custIds  String
     * <p>
     * 单据日期，格式YYYY-MM-DD  docDate  LocalDate
     * <p>
     * 交货日期，格式YYYY-MM-DD  deliveryDate  LocalDate
     * <p>
     * 业务员  clerk  String
     * <p>
     * 状态  status  Integer
     * <p>
     * 删除标识，默认为0，标识不删除  deleteFlag  String
     * <p>
     * 备注  remark  String
     * <p>
     * 终端源, 0 PC web, 1 手机web, 2 微信公众号, 3 小程序，4 android, 5 iOS, 6, api接入  createTerminalSource  Integer
     * <p>
     * 创建人  createBy  Long
     * <p>
     * 修改人  updateBy  Long
     * <p>
     * 创建时间  createTime  LocalDateTime
     * <p>
     * 修改时间  updateTime  LocalDateTime
     */
    @Autowired
    private OrderService orderService;


    @GetMapping("{id}")
    @ApiOperation(value = "根据id获取单个Order", notes = "根据id获取单个Order")
    public RespEntity<Order> get(@PathVariable Long id) {
        return RespEntity.ok().setResponseContent(orderService.selectById(id));
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name = "offset", value = "起始页", required = true, paramType = "query"),
            @ApiImplicitParam(name = "limit", value = "记录数", required = true, paramType = "query")
    })
    @ApiOperation(value = "分页查询Order", notes = "分页查询Order")
    @GetMapping
    public RespEntity<PageInfo<Order>> list(PagingRequest pagingRequest) {
        return RespEntity.ok().setResponseContent(orderService.listPage(pagingRequest, null));
    }


    @PostMapping
    @ApiOperation(value = "保存Order", notes = "保存Order")
    public RespEntity insert(@RequestBody Order order) {
        if (!orderService.insert(order)) {
            return RespEntity.badRequest("保存失败");
        }
        return RespEntity.ok("保存成功");
    }


    @PutMapping
    @ApiOperation(value = "根据ID修改Order", notes = "根据ID修改Order")
    public RespEntity update(@RequestBody Order order) {
        if (!orderService.updateById(order)) {
            return RespEntity.badRequest("更新失败");
        }
        return RespEntity.ok("更新成功");
    }


    @DeleteMapping("{id}")
    @ApiOperation(value = "根据ID删除Order", notes = "根据ID删除Order")
    public RespEntity delete(@PathVariable Long id) {
        if (!orderService.deleteById(id)) {
            return RespEntity.badRequest("删除失败");
        }
        return RespEntity.ok("删除成功");
    }


}