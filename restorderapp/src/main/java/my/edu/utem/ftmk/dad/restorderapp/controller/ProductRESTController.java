package my.edu.utem.ftmk.dad.restorderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.ftmk.dad.restorderapp.model.Product;
import my.edu.utem.ftmk.dad.restorderapp.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductRESTController {

	@Autowired
	private ProductRepository productRepository;
	
	@DeleteMapping("{productId}")
	public ResponseEntity<HttpStatus> deleteProductType(long productId)
	{
		productRepository.deleteById(productId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping
	public List<Product> getProductTypes()
	{
		return productRepository.findAll();
	}
	
	@GetMapping("{productId}")
	public Product getProductType(long productId)
	{
		Product productType = productRepository.findById(productId).get();
		return productType;
	}
	
	@PostMapping()
	public Product insertProductType(Product product)
	{
		return productRepository.save(product);
	}
	
	@PutMapping()
	public Product updateProductType(Product product)
	{
		return productRepository.save(product);
	}
}
