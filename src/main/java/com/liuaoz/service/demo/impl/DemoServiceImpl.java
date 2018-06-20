package com.liuaoz.service.demo.impl;

import com.liuaoz.service.demo.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@Service
@Slf4j
public class DemoServiceImpl implements IDemoService {
    @Override
    public void test() {
        log.info("demo service test...");
    }
}
