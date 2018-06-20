package com.liuaoz.dao.demo;

import com.liuaoz.model.demo.DemoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {

    DemoEntity selectByName(String name);

}
