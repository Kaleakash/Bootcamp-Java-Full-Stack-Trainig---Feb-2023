package eshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eshopping.entity.Orders;
import eshopping.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	AccountService accountService;
	
	public String placeOrcer(Orders orders) {
		ordersRepository.save(orders);
		accountService.debitAmount(orders.getEmail(), orders.getTotalAmount());
		return "Order Placed successfully";
	}
}
