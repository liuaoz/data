package com.liuaoz.dao.demo;

import com.liuaoz.model.demo.DemoEntity;
import tk.mybatis.mapper.common.Mapper;

public interface DemoMapper extends Mapper<DemoEntity> {

    DemoEntity selectByName(String name);

}
