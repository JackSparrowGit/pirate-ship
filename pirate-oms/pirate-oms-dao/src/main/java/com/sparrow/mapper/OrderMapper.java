package com.sparrow.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sparrow.oms.domain.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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

    /**
     * @return
     */
    List<Order> getList();
}
