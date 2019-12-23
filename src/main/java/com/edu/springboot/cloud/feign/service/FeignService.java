package com.edu.springboot.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @program: eureka-client
 * @author: dingkaige
 * @date: 2019-12-23 14:17
 **/
//不捕获异常，没有默认实现
@FeignClient(name = "cloud-client/client/api")
//不捕获异常，只有默认实现
//@FeignClient(value = "cloud-client/client/api",fallback = FeignServiceImplDefault.class)
//捕获异常和默认实现
//@FeignClient(value = "cloud-client/client/api",fallbackFactory = FeignServiceCauseDefault.class)
public interface FeignService {
    @GetMapping("/{id}")
    Object findByPathId(@PathVariable(name = "id") Long id);

    @GetMapping("findById")
    Object findById(@RequestParam(name = "id") Long id);
}

