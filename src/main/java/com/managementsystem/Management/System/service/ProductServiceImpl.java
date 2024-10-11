package com.managementsystem.Management.System.service;

import com.managementsystem.Management.System.dto.AddProductRequest;
import com.managementsystem.Management.System.dto.UpdateProductRequest;
import com.managementsystem.Management.System.dto.ViewProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Override
    public String addProduct(AddProductRequest request) {
        return null;
    }

    @Override
    public String updateProductDetails(String productId, UpdateProductRequest request) {
        return null;
    }

    @Override
    public String deleteProduct(String productId) {
        return null;
    }

    @Override
    public String updateStock(String productId, Integer stock) {
        return null;
    }

    @Override
    public ViewProduct getProductById(String productId) {
        return null;
    }

    @Override
    public List<ViewProduct> getAllProduct() {
        return null;
    }
}
