package com.demo.productmanagement.controller;

import com.demo.productmanagement.entity.ProductEntity;
import com.demo.productmanagement.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;

  @GetMapping
  public Page<ProductEntity> findAll(Pageable pageable) {
    return productService.findAll(pageable);
  }
}
