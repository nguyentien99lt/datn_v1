package com.services;

import com.client.response.FindByPageResponse;
import com.entities.CartEntity;
import com.entities.CartItemEntity;

import java.util.Optional;

public interface ICartItemService {
    public CartItemEntity create(CartItemEntity cartItemEntity);
    public CartItemEntity update(CartItemEntity cartItemEntity);
    public CartItemEntity partialUpdate(CartItemEntity cartItemEntity);
    public CartItemEntity delete(Integer id);
    public Optional<CartItemEntity> readById(Integer id);
    public FindByPageResponse<CartItemEntity> findByPage(Integer pageNumber, Integer pageSize);

}
