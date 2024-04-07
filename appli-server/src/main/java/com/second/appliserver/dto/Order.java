package com.second.appliserver.dto;

import lombok.Data;

@Data
public class Order {
    private int orderId;
    private String name;
    private int quantity;
}

