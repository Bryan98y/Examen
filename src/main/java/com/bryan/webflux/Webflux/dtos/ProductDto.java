package com.bryan.webflux.Webflux.dtos;

import com.bryan.webflux.Webflux.documents.Product;

public class ProductDto {
    private Long id;
    private String name,type,user;
    private Boolean active;
    private  int data;


    public ProductDto(Long id, String name, String type, String user, boolean active, int data) {
        this.id=id;
        this.name = name;
        this.type = type;
        this.user = user;
        this.active = active;
        this.data = data;
    }
    public ProductDto(Product product){

        this(
                product.getId(),
                product.getName(),
                product.getType(),
                product.getUser(),
                product.getActive(),
                product.getData()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
