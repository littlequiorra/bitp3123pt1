package my.edu.utem.ftmk.dad.restorderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.ftmk.dad.restorderapp.repository.OrderTypeRepository;
import my.edu.utem.ftmk.dad.restorderapp.model.OrderType;

@RestController
@RequestMapping("/api/ordertypes")
public class OrderTypeRESTController {	
	
	@Autowired
	private OrderTypeRepository orderTypeRepository;
	
	/*
	 * Delete a record from table OrderType  
	 */
	
	@DeleteMapping("{orderTypeId}")
	public ResponseEntity<HttpStatus> deleteOrderType(@PathVariable long orderTypeId)	{
		orderTypeRepository.deleteById(orderTypeId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/*
	 * Retrieves all records from table OrderType
	 */
	
	@GetMapping
	public List<OrderType> getOrderTypes()	{	
		return orderTypeRepository.findAll();
	}
	
	/*
	 * Retrieves a record from table OrderType according to a web parameter's value
	 */
	
	@GetMapping("{orderTypeId}")
	public OrderType getOrderType(@PathVariable long orderTypeId) {	
		OrderType orderType = orderTypeRepository.findById(orderTypeId).get();
		return orderType;
	}
	
	/*
	 *  Creates a new record in table OrderType	
	 */
	
	@PostMapping()
	public OrderType insertOrderType(@RequestBody OrderType orderType) {
		return orderTypeRepository.save(orderType);
	}
	
	/*
	 * Updates  a record in table OrderType
	 */
	
	@PutMapping()
	public OrderType updateOrderType(@RequestBody OrderType orderType) {
		return orderTypeRepository.save(orderType);
	}
}