package com.sparrow.oms.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparrow.common.global.PagingRequest;
import com.sparrow.oms.domain.bean.Order;
import com.sparrow.oms.mapper.OrderMapper;
import com.sparrow.oms.web.service.OrderService;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Jack
 * @since 2018-08-07 ${time}
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Override
    public PageInfo<Order> listPage(PagingRequest pagingRequest, Wrapper wrapper) {
        PageHelper.startPage(pagingRequest.getOffset(), pagingRequest.getLimit());
        return new PageInfo<>(super.selectList(wrapper));
    }

}
