package eshopping.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import eshopping.bean.OrdersInfo;
import eshopping.entity.Orders;
import eshopping.entity.ProductOrdersInfo;
import eshopping.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ProductOrdersInfoService productOrdersInfoService; 
	public String placeOrcer(OrdersInfo ordersInfo) {
		ordersInfo.setOrderDate(LocalDateTime.now());
		String result = restTemplate.postForObject("http://E-SHOPPING-ADMIN-APP/phase3/admin/orders/placeOrder",ordersInfo, String.class);
		accountService.debitAmount(ordersInfo.getEmail(), ordersInfo.getTotalAmount());
		return result;
	}
	
	
	
	public List<Object> viewOrderByCustomer(String email) {
		List<Object> result = restTemplate.getForObject("http://E-SHOPPING-ADMIN-APP/phase3/admin/orders/viewOrderByUser?email="+email, List.class);
		System.out.println(result.size());
		return result;
	}
}
