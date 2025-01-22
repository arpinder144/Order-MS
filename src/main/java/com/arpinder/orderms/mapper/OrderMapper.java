package com.arpinder.orderms.mapper;

import com.arpinder.orderms.dto.OrderDTO;
import com.arpinder.orderms.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderToOrderDTO(Order order);
    Order OrderDTOToOrder(OrderDTO orderDTO);
}
