package eshopping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	ProductOrdersInfoService productOrdersInfoService; 
	public String placeOrcer(OrdersInfo ordersInfo) {
		Orders orders = new Orders();
		orders.setEmail(ordersInfo.getEmail());
		orders.setOrderDate(ordersInfo.getOrderDate());
		orders.setOrderStatus(ordersInfo.getOrderStatus());
		orders.setShipmentCharges(ordersInfo.getShipmentCharges());
		orders.setTotalAmount(orders.getTotalAmount());
		orders.setTotalItems(orders.getTotalItems());
		int numberOfProduct = ordersInfo.getProducts().size();
		Orders oo= ordersRepository.save(orders);
		List<ProductOrdersInfo> listOfProductorderinfo = new ArrayList<>();
		for(int i=0;i<numberOfProduct;i++) {
			ProductOrdersInfo poi = new ProductOrdersInfo();
			//poi.setPoid(i+1);
			poi.setOid(oo.getOrderid());
			poi.setPid(ordersInfo.getProducts().get(i).getPid());
			poi.setQty(ordersInfo.getProducts().get(i).getQty());
			listOfProductorderinfo.add(poi);
		}
		productOrdersInfoService.storeProductOrdersInfo(listOfProductorderinfo);
		accountService.debitAmount(orders.getEmail(), orders.getTotalAmount());
		return "Order Placed successfully";
	}
	
	public List<Orders> viewOrdersByUser(String emalid){
		return ordersRepository.viewByOrders(emalid);
	}
	
	public List<Orders> viewAllOrders() {
		return ordersRepository.findAll();
	}
}
