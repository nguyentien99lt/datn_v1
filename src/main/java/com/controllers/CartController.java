package com.controllers;


import com.client.request.FindByPageRequest;
import com.client.response.FindByPageResponse;
import com.entities.CartEntity;
import com.services.iml.ImlCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CartController {

    @Autowired
    private ImlCartService cartService;

    @PostMapping("/find-by-page")
    public FindByPageResponse<CartEntity> findByPage(@RequestBody FindByPageRequest FinByPageRequest) {
        return cartService.findByPage(FinByPageRequest);
    }


}
