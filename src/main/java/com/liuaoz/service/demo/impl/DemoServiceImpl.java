package com.liuaoz.service.demo.impl;

import com.liuaoz.dao.demo.DemoMapper;
import com.liuaoz.model.demo.Demo;
import com.liuaoz.service.demo.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@Service
@Slf4j
public class DemoServiceImpl implements IDemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public Demo getById(Long id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Demo getByName(String name) {
        Demo demo = demoMapper.selectByPrimaryKey(1L);

        log.info(demo.toString());

        log.info("=======");
        Demo param = new Demo();
        param.setName(name);
        return demoMapper.selectByName(name);
    }
}
