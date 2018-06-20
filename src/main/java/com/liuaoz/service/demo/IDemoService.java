package com.liuaoz.service.demo;

import com.liuaoz.model.demo.DemoEntity;

/**
 * Created by matrix_stone on 2018/6/20.
 */
public interface IDemoService {

    DemoEntity getByName(String name);
}
