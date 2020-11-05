package com.bryan.webflux.Webflux.api_rest_controllers;

import com.bryan.webflux.Webflux.dtos.ProductDto;
import com.bryan.webflux.Webflux.rest_controller.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ProductResource.PRODUCTS)
public class ProductResource {
    public static final String PRODUCTS="/products";

    private ProductController productController;
    @Autowired
    public ProductResource(ProductController productController) {
        this.productController = productController;
    }
    @PostMapping(produces = {"application/json"})
    public Mono<ResponseEntity> create(@RequestBody ProductDto productDto){
        return this.productController.createProduct(productDto);
    }

}
