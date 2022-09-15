package com.services;

import com.client.request.FindByPageRequest;
import com.client.response.FindByPageResponse;
import com.entities.CartEntity;
import org.hibernate.service.spi.ServiceException;

import java.util.Optional;

public interface ICartService {
    public CartEntity create(CartEntity cartEntity);
    public CartEntity update(CartEntity cartEntity);
    public CartEntity partialUpdate(CartEntity cartEntity);
    public CartEntity delete(Integer id);
    public Optional<CartEntity> readById(Integer id);
    public FindByPageResponse<CartEntity> findByPage(FindByPageRequest findByPageRequest) throws ServiceException;;

}
