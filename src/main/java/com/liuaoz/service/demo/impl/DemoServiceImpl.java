package com.liuaoz.service.demo.impl;

import com.liuaoz.dao.demo.DemoMapper;
import com.liuaoz.model.demo.DemoEntity;
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
    public DemoEntity getByName(String name) {
        demoMapper.selectByPrimaryKey(1);
        DemoEntity param = new DemoEntity();
        param.setName(name);
        return demoMapper.selectByName(name);
    }
}
