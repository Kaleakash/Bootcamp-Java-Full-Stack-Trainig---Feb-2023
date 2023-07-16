package eshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eshopping.entity.Orders;
import eshopping.service.OrdersService;

@RestController
@RequestMapping("phase3/customer/orders")
@CrossOrigin	
public class OrdersController {

	@Autowired
	OrdersService ordersService;
	
	@PostMapping(value = "placeOrder",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String placeOrder(@RequestBody Orders order) {
		System.out.println(order);
		return ordersService.placeOrcer(order);
	}
}
