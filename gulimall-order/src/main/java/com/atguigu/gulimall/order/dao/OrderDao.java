package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ????
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-07-19 14:30:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
