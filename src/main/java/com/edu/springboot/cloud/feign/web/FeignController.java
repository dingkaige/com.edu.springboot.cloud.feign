package com.edu.springboot.cloud.feign.web;

import com.edu.springboot.cloud.feign.service.FeignService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @program: eureka-service
 * @author: dingkaige
 * @date: 2019-12-23 11:05
 **/
@RestController
@AllArgsConstructor
@Log4j2
public class FeignController {

    private FeignService feignService;

    @GetMapping("/{id}")
    public Object findByPathId(@PathVariable Long id) {
        log.info("Path-->id:" + id);
        return feignService.findByPathId(id);
    }
    @GetMapping("findById")
    public Object findById(@RequestParam(name = "id") Long id) {
        log.info("findById-->id:" + id);
        return feignService.findById(id);
    }
}
