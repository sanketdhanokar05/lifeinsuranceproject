package com.project.package2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.package2.entity.Product;
import com.project.package2.exception.ProductNotFoundException;
import com.project.package2.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		Product newProduct = productRepository.save(product);
		return newProduct;
	}

	@Override
	public Product updateProduct(Product product) {
		Optional<Product> updatedProduct = productRepository.findById(product.getPid());
		if(updatedProduct.isEmpty()) {
			throw new ProductNotFoundException("The Product Is Not Available,Add The Product With Id"+product.getPid());
		}
		Product updateProduct = productRepository.save(product);
		return updateProduct;
	}

	@Override
	public String deleteProduct(int productId) {
		Optional<Product> updatedProduct = productRepository.findById(productId);
		if(updatedProduct.isEmpty()) {
			throw new ProductNotFoundException("The Product Is Not Available With Id"+productId);
		}
		productRepository.deleteById(productId);
		return "Product Deleted Successfully";	
	}

	@Override
	public Product viewProduct(int productId) {
		Optional<Product> optionalProduct=productRepository.findById(productId);
		if(!optionalProduct.isPresent()) {
			throw new ProductNotFoundException("Sorry! Product is not existing with id: "+productId);
		}

		return optionalProduct.get();
	}

}
