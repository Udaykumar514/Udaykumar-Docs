package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//Normal Query's
	@Query("SELECT p FROM Product p WHERE " +    //Class Name
	"p.name LIKE CONCAT('%', :query, '%')" +   
	"Or p.description LIKE CONCAT('%', :query, '%')")
	List<Product> searchProducts(String query);
	
	//Native SQL Query's
	//Normal Query's
	@Query(value ="SELECT * FROM products p WHERE " +   //table Name
	"p.name LIKE CONCAT('%', :query, '%')" +
	"Or p.description LIKE CONCAT('%', :query, '%')" , nativeQuery = true)
	List<Product> searchProductsSQL(String query);

}
