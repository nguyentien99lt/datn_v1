package com.repositories;

import com.entities.ProductDetailEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface IProductDetailRepository extends JpaRepository<ProductDetailEntity, Integer> {
    Page<ProductDetailEntity> findAll(Pageable page);
}
