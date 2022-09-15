package com.repositories;

import com.entities.OrderDetailEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDetailRepository extends JpaRepository<OrderDetailEntity, Integer> {
    Page<OrderDetailEntity> findAll(Pageable page);
}
