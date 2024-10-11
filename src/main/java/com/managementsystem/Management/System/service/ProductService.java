package com.managementsystem.Management.System.service;

import com.managementsystem.Management.System.dto.AddProductRequest;
import com.managementsystem.Management.System.dto.UpdateProductRequest;
import com.managementsystem.Management.System.dto.ViewProduct;

import java.util.List;

public interface ProductService {


    public String addProduct(AddProductRequest request);

    public String updateProductDetails(String productId, UpdateProductRequest request);

    public String deleteProduct(String productId);

    public String updateStock(String productId, Integer stock);

    public ViewProduct getProductById(String productId);

    public List<ViewProduct> getAllProduct();

}
