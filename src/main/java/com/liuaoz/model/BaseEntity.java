package com.liuaoz.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.util.Date;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@Setter
@Getter
@NoArgsConstructor
public abstract class BaseEntity {

    @Id
    public Long id;

    public String creator;

    public String operator;

    public Date createTime;

    public Date updateTime;

}
