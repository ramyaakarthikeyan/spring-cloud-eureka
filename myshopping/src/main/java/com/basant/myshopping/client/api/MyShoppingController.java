package com.basant.myshopping.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myshopping")
public class MyShoppingController {

	@Autowired
	private OrderFeignClient orderFeignClient;


	@GetMapping("/{price}")
	public String shop(@PathVariable long price) {
		return orderFeignClient.orderNow(price) + " - from feign client and eureka";
	}

	@GetMapping("/cancel")
	public String cancel() {
		return "Hi user, your order has been cancelled";
	}

}
