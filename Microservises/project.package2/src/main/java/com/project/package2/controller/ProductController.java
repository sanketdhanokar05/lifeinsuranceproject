package com.project.package2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.package2.entity.Product;
import com.project.package2.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/newproduct")
	 public ResponseEntity<Product> newProduct(@RequestBody Product product) {
		 Product newProduct =productService.addProduct(product);
		 
		 ResponseEntity<Product> responseEntity = new ResponseEntity<>(newProduct,HttpStatus.CREATED);
			return responseEntity;
			
	 }
	 
	@PostMapping("/updateproduct")
	public ResponseEntity<Product> updatedProduct(Product product) {

         Product updatedProduct =productService.addProduct(product);
    
		 ResponseEntity<Product> responseEntity= new ResponseEntity<Product>(updatedProduct,HttpStatus.CREATED);
			return responseEntity;
	}
	 
	 @GetMapping("/delete/{pid}")
		public ResponseEntity<?> deletedProduct(@PathVariable("pid")int productId){
			
		    productService.deleteProduct(productId);
			return new ResponseEntity<>("Customer Deleted with id: "+productId,HttpStatus.OK);
			
		}
	 
	 @GetMapping("/view/{pid}")
		public ResponseEntity<?> viewAllProduct(@PathVariable("pid") int productId)
		{
		 Product product=productService.viewProduct(productId);
			return new ResponseEntity<>(product, HttpStatus.OK);
			
		}
}
