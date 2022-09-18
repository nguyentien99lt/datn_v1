package com.services.iml;

import com.client.request.FindByPageRequest;
import com.client.response.FindByPageResponse;
import com.entities.CartEntity;
import com.repositories.ICartRepository;
import com.services.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImlCartService implements ICartService {


    @Autowired
    private ICartRepository cartRepository;

    @Override
    public CartEntity create(CartEntity cartEntity) {
        cartRepository.save(cartEntity);
        return cartEntity;
    }


    @Override
    public CartEntity update(CartEntity cartEntity) {
        return null;
    }

    @Override
    public CartEntity partialUpdate(CartEntity cartEntity) {
        return null;
    }

    @Override
    public CartEntity delete(Integer id) {
        return null;
    }

    @Override
    public Optional<CartEntity> readById(Integer id) {
        return Optional.empty();
    }

    @Override
    public FindByPageResponse<CartEntity> findByPage(FindByPageRequest findByPageRequest) {
        try {
            Integer pageNumber = findByPageRequest.getPageNumber();
            Integer pageSize = findByPageRequest.getPageSize();
            if (pageNumber == null || pageNumber < 0) pageNumber = 0;
            if (pageSize == null || pageSize < 0) pageSize = 1;
            Pageable page = PageRequest.of(pageNumber, pageSize);
            Page<CartEntity> pageCart = cartRepository.findAll(page);
            List<CartEntity> cartEntityList = pageCart.getContent();
            FindByPageResponse<CartEntity> reponse = new FindByPageResponse();
            reponse.setPageResponse(cartEntityList);
            reponse.setPageSize(pageCart.getSize());
            reponse.setCurrentPage(pageCart.getNumber());
            reponse.setTotalPage(pageCart.getTotalPages());
            reponse.setTotalElement(pageCart.getTotalElements());
            return reponse;
        } catch (Exception e) {
            return null;
        }

    }
}
