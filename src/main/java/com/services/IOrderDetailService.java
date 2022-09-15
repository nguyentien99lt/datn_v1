package com.services;

import com.client.response.FindByPageResponse;
import com.entities.OrderDetailEntity;
import com.entities.OrderEntity;

import java.util.Optional;

public interface IOrderDetailService {
    public OrderDetailEntity create(OrderDetailEntity orderDetailEntity);
    public OrderDetailEntity update(OrderDetailEntity orderDetailEntity);
    public OrderDetailEntity partialUpdate(OrderDetailEntity orderDetailEntity);
    public OrderDetailEntity delete(Integer id);
    public Optional<OrderDetailEntity> readById(Integer id);
    public FindByPageResponse<OrderDetailEntity> findByPage(Integer pageNumber, Integer pageSize);

}
