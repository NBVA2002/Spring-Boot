package com.demo.productmanagement.service;

import com.demo.productmanagement.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

  Page<ProductEntity> findAll(Pageable pageable);
}
