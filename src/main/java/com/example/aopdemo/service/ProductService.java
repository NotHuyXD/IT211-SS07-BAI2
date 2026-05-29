package com.example.aopdemo.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void addProduct(String productName) {
        System.out.println("SERVICE: Đã thêm sản phẩm " + productName);
    }

    public void getProduct() {
        System.out.println("SERVICE: Lấy thông tin sản phẩm");
    }
}