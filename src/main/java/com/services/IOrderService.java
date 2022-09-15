package com.services;

import com.client.response.FindByPageResponse;
import com.entities.CartEntity;
import com.entities.OrderEntity;

import java.util.Optional;

public interface IOrderService {
    public OrderEntity create(OrderEntity orderEntity);
    public OrderEntity update(OrderEntity orderEntity);
    public OrderEntity partialUpdate(OrderEntity orderEntity);
    public OrderEntity delete(Integer id);
    public Optional<OrderEntity> readById(Integer id);
    public FindByPageResponse<OrderEntity> findByPage(Integer pageNumber, Integer pageSize);

}
