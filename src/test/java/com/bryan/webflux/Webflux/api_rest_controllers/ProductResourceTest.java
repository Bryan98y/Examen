package com.bryan.webflux.Webflux.api_rest_controllers;

import com.bryan.webflux.Webflux.dtos.ProductDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.BodyInserters;

import static org.junit.jupiter.api.Assertions.*;
@ApiTestConfig
class ProductResourceTest {
    @Autowired
    private RestService restService;


    @Test
    void create() {
        ProductDto productDto = new ProductDto("id","name","type","user","active","data");
        String get = this.restService.restBuilder().post()
                .uri(ProductResource.PRODUCTS).body(BodyInserters.fromObject(productDto))
                .exchange().expectStatus().isCreated().expectBody(String.class).returnResult().getResponseBody();
        assertNotNull(get);
        assertEquals("\"product createad\"",get);

    }
}