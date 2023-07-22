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
	ProductOrdersInfoService productOrdersInfoService;
	
	public String placeOrder(OrdersInfo ordersInfo) {
		System.out.println("In Admin Service");
		System.out.println(ordersInfo);
		
		Orders orders = new Orders();
		orders.setEmail(ordersInfo.getEmail());
		orders.setOrderDate(ordersInfo.getOrderDate());
		orders.setOrderStatus(ordersInfo.getOrderStatus());
		orders.setShipmentCharges(ordersInfo.getShipmentCharges());
		orders.setTotalAmount(ordersInfo.getTotalAmount());
		orders.setTotalItems(ordersInfo.getTotalItems());
		System.out.println(orders);
		int numberOfProduct = ordersInfo.getProducts().size();
		ordersRepository.save(orders);
		ordersRepository.flush();
		System.out.println("After saved ");
		System.out.println(orders);
		System.out.println("Number of products "+numberOfProduct);
		List<ProductOrdersInfo> listOfProductorderinfo = new ArrayList<>();
		for(int i=0;i<numberOfProduct;i++) {
			ProductOrdersInfo poi = new ProductOrdersInfo();
			//poi.setPoid(i+1);
			poi.setOid(orders.getOrderid());
			poi.setPid(ordersInfo.getProducts().get(i).getPid());
			poi.setQty(ordersInfo.getProducts().get(i).getQty());
			listOfProductorderinfo.add(poi);
		}
		productOrdersInfoService.storeProductOrdersInfo(listOfProductorderinfo);
		//accountService.debitAmount(orders.getEmail(), orders.getTotalAmount());
		return "Order Placed successfully";
	}
	
	public List<Object> viewOrdersByUser(String emalid){
		return ordersRepository.viewByOrdersByCustomer(emalid);
	}
	
	public List<Object[]> getAllOrdersInfo() {
		return ordersRepository.getAllOrdersInfo();
	}
	
	
}
