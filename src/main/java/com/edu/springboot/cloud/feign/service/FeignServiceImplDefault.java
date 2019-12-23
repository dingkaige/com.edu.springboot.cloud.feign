package com.edu.springboot.cloud.feign.service;

import lombok.extern.log4j.Log4j2;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @description:TestService默认实现
 * @program: eureka-client
 * @author: dingkaige
 * @date: 2019-12-23 18:26
 **/
@Service
@Log4j2
public class FeignServiceImplDefault implements FeignService {

    @Override
    public Object findById(Long id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", id);
        log.info("FeignServiceImplDefault-->findById-->id:" + id);
        return jsonObject;
    }

    @Override
    public Object findByPathId(Long id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", id);
        log.info("FeignServiceImplDefault-->findByPathId-->id:" + id);
        return jsonObject;
    }
}
