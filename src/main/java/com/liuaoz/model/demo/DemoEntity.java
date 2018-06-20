package com.liuaoz.model.demo;

import com.liuaoz.model.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class DemoEntity extends BaseEntity{

    private String name;

    private String code;

    private String message;

}
