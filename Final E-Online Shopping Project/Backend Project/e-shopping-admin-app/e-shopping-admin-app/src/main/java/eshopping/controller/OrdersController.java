package eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eshopping.bean.OrdersInfo;
import eshopping.entity.Orders;
import eshopping.service.OrdersService;
@RestController
@RequestMapping("phase3/admin/orders")
@CrossOrigin	
public class OrdersController {

	@Autowired
	OrdersService ordersService;
	
	@PostMapping(value = "placeOrder",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String placeOrder(@RequestBody OrdersInfo orderInfo) {
		System.out.println(orderInfo);
		//return "done";
		return ordersService.placeOrder(orderInfo);
	}
	
	@GetMapping(value = "viewOrderByUser",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Object> viewOrdersByUser(@RequestParam("email") String emailid){
		return ordersService.viewOrdersByUser(emailid);
	}
	

	@GetMapping(value = "viewAllOrdersDetails",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Object[]> getAllOrdersDetails() {
		return ordersService.getAllOrdersInfo();
	}
}
