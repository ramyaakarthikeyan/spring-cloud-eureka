package com.basant.order.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderServiceController {

	@Autowired
	private RestTemplate template;



	@GetMapping("/{price}")
	public String orderNow(@PathVariable long price) {
		return "Hi user, your order placed successfully with MRP$ :" + price;

	}


	@GetMapping("/cancel")
	public String cancelOrder() {
		String URL = "SHOPPING-SERVICE/myshopping/cancel";
		return template.getForObject(URL, String.class) + " - from Eureka";
	}

}
