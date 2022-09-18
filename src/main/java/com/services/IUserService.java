package com.services;

import com.client.response.FindByPageResponse;
import com.entities.OrderEntity;
import com.entities.UserEntity;

import java.util.Optional;

public interface IUserService {
    public UserEntity create(UserEntity userEntity);
    public UserEntity update(UserEntity userEntity);
    public UserEntity partialUpdate(UserEntity userEntity);
    public UserEntity delete(Integer id);
    public Optional<UserEntity> readById(Integer id);
    public FindByPageResponse<UserEntity> findByPage(Integer pageNumber, Integer pageSize);

}
