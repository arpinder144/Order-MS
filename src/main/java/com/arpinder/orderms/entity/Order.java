package com.arpinder.orderms.entity;

import com.arpinder.orderms.dto.FoodItemDTO;
import com.arpinder.orderms.dto.Restaurant;
import com.arpinder.orderms.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {


    private Integer orderId;
    private List<FoodItemDTO> foodItemDTOList;
    private Restaurant restaurant;
    private UserDTO userDTO;
}
