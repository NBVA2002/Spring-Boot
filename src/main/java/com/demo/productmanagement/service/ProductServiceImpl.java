package com.demo.productmanagement.service;

import com.demo.productmanagement.entity.ProductEntity;
import com.demo.productmanagement.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public Page<ProductEntity> findAll(Pageable pageable) {
    return productRepository.findAll(pageable);
  }
}
