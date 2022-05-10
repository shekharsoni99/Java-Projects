package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping(value = "/products")
	public List<ProductDetails> showProductList() {
		List<ProductDetails> list = new ArrayList<>();
		list.add(new ProductDetails(1, "Shampoo", 110, "Sunsilk", "Shampoo", 10, 100));
		list.add(new ProductDetails(2, "Shampoo", 210, "Head & Shoulder", "Saop", 20, 200));
		list.add(new ProductDetails(3, "Soap", 310, "Dettol", "Shampoo", 30, 300));
		list.add(new ProductDetails(4, "Surf", 410, "Tide", "Shampoo", 40, 400));
		list.add(new ProductDetails(5, "Cleaner", 510, "harpik", "Shampoo", 50, 500));
		
		if(list.size() == 0)
			throw new EmptyProductList("There is no product in List");
		
		return list;
	}
	
	@GetMapping(value = "/product/{id}")
	public ProductDetails getProductById(@PathVariable("id") int id) {

		ProductDetails l1 = new ProductDetails(1, "Shampoo", 110, "Sunsilk", "Shampoo", 10, 100);
		ProductDetails l2 = new ProductDetails(2, "Shampoo", 210, "Head & Shoulder", "Saop", 20, 200);
		ProductDetails l3 = new ProductDetails(3, "Soap", 310, "Dettol", "Shampoo", 30, 300);
		ProductDetails l4 = new ProductDetails(4, "Surf", 410, "Tide", "Shampoo", 40, 400);
		ProductDetails l5 = new ProductDetails(5, "Cleaner", 510, "harpik", "Shampoo", 50, 500);
		
		Map<Integer, ProductDetails> map = new HashMap<>();
		
		map.put(1, l1);
		map.put(2, l2);
		map.put(3, l3);
		map.put(4, l4);
		map.put(5, l5);
		
		if(id > 20)
			throw new InvalidProductId("Product Not Found..Product Id must be less than 20");
		
		return map.get(id);
	}
	
	@RequestMapping(value = "/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		
		if(id > 20)
			throw new InvalidProductId("Product Not Found..Product Id must be less than 20");
		
		return "Product id: " + id + " Deleted successfully from the DB";
	}
	
	@RequestMapping(value = "/updateProduct/{id}")
	public String updateProduct(@PathVariable("id") int id) {
		return "Product id: " + id + " Updated successfully inside the DB";
	}
	
	@PostMapping(value = "/saveproduct")
	public ResponseEntity<String> saveProduct(@Valid @RequestBody ProductDetails productDetails) {
		return new ResponseEntity<String>("Product Saved to DB: " + productDetails.toString(), HttpStatus.ACCEPTED);
	}
}
