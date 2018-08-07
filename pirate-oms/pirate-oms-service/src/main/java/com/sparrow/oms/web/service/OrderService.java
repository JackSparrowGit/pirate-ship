package com.sparrow.oms.web.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.sparrow.common.global.PagingRequest;
import com.sparrow.oms.domain.bean.Order;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author Jack
 * @since 2018-08-07
 */
public interface OrderService extends IService<Order> {

    PageInfo<Order> listPage(PagingRequest pagingRequest, Wrapper wrapper);

}
