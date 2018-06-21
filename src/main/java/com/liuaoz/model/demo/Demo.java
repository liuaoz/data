package com.liuaoz.model.demo;

import com.liuaoz.model.BaseEntity;
import lombok.*;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class Demo extends BaseEntity{

    private String name;

    private String code;

    private String message;

}
