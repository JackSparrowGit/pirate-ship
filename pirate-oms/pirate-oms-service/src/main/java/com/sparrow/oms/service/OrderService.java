package com.sparrow.oms.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.github.pagehelper.PageInfo;
import com.sparrow.common.global.PagingRequest;
import com.sparrow.oms.domain.bean.Order;

import java.util.List;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author Jack
 * @since 2018-08-07
 */
public interface OrderService extends IService<Order> {

    /**
     * 默认分页(PageHelper分页)
     *
     * @param pagingRequest
     * @return PageInfo
     */
    PageInfo<Order> listPage(PagingRequest pagingRequest, Wrapper wrapper);

    List<Order> getList();
}
