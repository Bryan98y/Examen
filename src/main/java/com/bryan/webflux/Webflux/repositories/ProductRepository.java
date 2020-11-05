package com.bryan.webflux.Webflux.repositories;

import com.bryan.webflux.Webflux.documents.Product;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Mono;

public interface ProductRepository extends ReactiveSortingRepository<Product,String> {

}
