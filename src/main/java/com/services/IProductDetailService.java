package com.services;

import com.client.response.FindByPageResponse;
import com.entities.ProductDetailEntity;

import java.util.Optional;

public interface IProductDetailService {
    public ProductDetailEntity create(ProductDetailEntity productDetailEntity);
    public ProductDetailEntity update(ProductDetailEntity productDetailEntity);
    public ProductDetailEntity partialUpdate(ProductDetailEntity productDetailEntity);
    public ProductDetailEntity delete(Integer id);
    public Optional<ProductDetailEntity> readById(Integer id);
    public FindByPageResponse<ProductDetailEntity> findByPage(Integer pageNumber, Integer pageSize);

}
