package com.liuaoz.service.demo;

import com.liuaoz.model.demo.Demo;

/**
 * Created by matrix_stone on 2018/6/20.
 */
public interface IDemoService {

    Demo getById(Long id);

    Demo getByName(String name);
}
