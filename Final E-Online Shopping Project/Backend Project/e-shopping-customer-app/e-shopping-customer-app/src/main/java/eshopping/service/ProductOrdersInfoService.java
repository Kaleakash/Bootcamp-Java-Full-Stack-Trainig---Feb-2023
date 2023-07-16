package eshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eshopping.entity.ProductOrdersInfo;
import eshopping.repository.ProductOrdersInfoRepository;

@Service
public class ProductOrdersInfoService {

	@Autowired
	ProductOrdersInfoRepository productOrdersInfoRepository; 
	
	public String storeProductOrdersInfo(List<ProductOrdersInfo> productOrderInfo) {
		productOrdersInfoRepository.saveAll(productOrderInfo);
		return "store product order info";
	}
}
