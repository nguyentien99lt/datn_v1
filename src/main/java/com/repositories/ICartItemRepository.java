package com.repositories;

import com.entities.CartItemEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartItemRepository extends JpaRepository<CartItemEntity, Integer> {
    Page<CartItemEntity> findAll(Pageable page);
}
