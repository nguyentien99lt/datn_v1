package com.repositories;

import com.entities.CartEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartRepository extends JpaRepository<CartEntity, Integer> {
    Page<CartEntity> findAll(Pageable page);
}
