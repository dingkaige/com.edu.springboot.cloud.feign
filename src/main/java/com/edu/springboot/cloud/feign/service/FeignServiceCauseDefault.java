package com.edu.springboot.cloud.feign.service;

import feign.hystrix.FallbackFactory;
import lombok.extern.log4j.Log4j2;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @description: get异常信息
 * @program: eureka-client
 * @author: dingkaige
 * @date: 2019-12-23 18:42
 **/
@Service
@Log4j2
public class FeignServiceCauseDefault implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        return new FeignService() {
            @Override
            public Object findById(Long id) {
                log.info("sorry, fallback. reason was: " + throwable);
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", id);
                log.info("FeignServiceCauseDefault-->findById-->id::" + id);
                return jsonObject;
            }

            @Override
            public Object findByPathId(Long id) {
                log.info("sorry, fallback. reason was: " + throwable);
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", id);
                log.info("FeignServiceCauseDefault-->findByPathId-->id:" + id);
                return jsonObject;
            }
        };
    }


}
