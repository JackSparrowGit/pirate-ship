package com.sparrow.oms.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sparrow.oms.domain.bean.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author Jack
 * @since 2018-08-07
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
