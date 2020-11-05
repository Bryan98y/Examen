package com.bryan.webflux.Webflux.rest_controller;

import com.bryan.webflux.Webflux.documents.Product;
import com.bryan.webflux.Webflux.dtos.ProductDto;
import com.bryan.webflux.Webflux.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Mono<ResponseEntity> createProduct(ProductDto productDto){
        Product product = new Product();
        product.setActive(product.getActive());
        product.setName(product.getUser());
        product.setData(product.getData());
        product.setType(product.getType());
        product.setUser(product.getUser());
        product.setId(product.getId());

       return this.productRepository.save(product).map(calback ->{
           return new ResponseEntity("\" product created\"", HttpStatus.CREATED);
       }).onErrorReturn(new ResponseEntity("\" product not created\"", HttpStatus.NOT_ACCEPTABLE));
    }

}
