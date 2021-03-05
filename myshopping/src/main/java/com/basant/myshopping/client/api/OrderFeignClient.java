package com.basant.myshopping.client.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="ORDER-SERVICE")
public interface OrderFeignClient {

    @GetMapping("/order/{price}")
    String orderNow(@PathVariable("price") long price);
}
