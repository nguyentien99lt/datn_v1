package com.services;

import com.client.response.FindByPageResponse;
import com.entities.OrderEntity;
import com.entities.ProductEntity;

import java.util.Optional;

public interface IProductService {
    public ProductEntity create(ProductEntity productEntity);
    public ProductEntity update(ProductEntity productEntity);
    public ProductEntity partialUpdate(ProductEntity productEntity);
    public ProductEntity delete(Integer id);
    public Optional<ProductEntity> readById(Integer id);
    public FindByPageResponse<ProductEntity> findByPage(Integer pageNumber, Integer pageSize);

}
