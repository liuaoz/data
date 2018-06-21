package com.liuaoz.dao.demo;

import com.liuaoz.model.demo.Demo;
import tk.mybatis.mapper.common.Mapper;

public interface DemoMapper extends Mapper<Demo> {

    Demo selectByName(String name);

}
