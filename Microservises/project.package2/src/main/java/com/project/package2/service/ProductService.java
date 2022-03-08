package com.project.package2.service;

import com.project.package2.entity.Product;

public interface ProductService {

     Product addProduct(Product product);
	 
	 Product updateProduct(Product product);
	 
	 String deleteProduct(int productId);
	 
	 Product viewProduct(int productId);
	 
 }
