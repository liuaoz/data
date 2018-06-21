package com.liuaoz.service.demo.impl;

import com.liuaoz.DataApplicationTests;
import com.liuaoz.model.demo.Demo;
import com.liuaoz.service.demo.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@Slf4j
public class DemoServiceImplTest extends DataApplicationTests{

    @Resource
    private IDemoService iDemoService;

    @Test
    public void getByName() {

        Demo demoEntity = iDemoService.getByName("aaaaa");

        log.info(demoEntity.toString());
    }

}
