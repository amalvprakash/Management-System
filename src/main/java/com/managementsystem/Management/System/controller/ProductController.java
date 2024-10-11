package com.managementsystem.Management.System.controller;

import com.managementsystem.Management.System.dto.AddProductRequest;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/product")
public class ProductController {
    @PostMapping(value = "/add")
    public String addProduct(@RequestBody AddProductRequest request){
        return null;
    }

    @PutMapping(value = "/update/{productId}")
    public String updateProduct(@PathVariable String productId, @RequestBody String request){
        return null;
    }

    @PutMapping(value = "/stock/{productId}/{stock}")
    public String addStock(@PathVariable String productId, @RequestBody Integer stock){
        return null;
    }

    @DeleteMapping(value = "/delete/{productId}")
    public String deleteProduct(@PathVariable String productId){
        return null;
    }

    @GetMapping(value = "/view")
    public String viewProduct(@RequestParam(value = "productId") String productId){
        return null;
    }

    @GetMapping(value = "/viewAll")
    public String addProduct(){
        return null;
    }

}
