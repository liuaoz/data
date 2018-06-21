package com.liuaoz.model;

import lombok.*;

import javax.persistence.Id;
import java.util.Date;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@Data
public abstract class BaseEntity {

    @Id
    public Long id;

    public String creator;

    public String operator;

    public Date createTime;

    public Date updateTime;

}
