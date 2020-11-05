package com.bryan.webflux.Webflux.dtos;

import com.bryan.webflux.Webflux.documents.Product;

public class ProductDto {
    private String id;
    private String name,type,user;
    private boolean active;
    private  int data;

    public ProductDto(String id, String name, String type, String user, String active, String data) {
    }


    public ProductDto(String id, String name, String type, String user, boolean active, int data) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.user = user;
        this.active = active;
        this.data = data;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
