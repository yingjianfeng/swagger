package com.yingjf.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)   //开启链式编程
@NoArgsConstructor
@ApiModel
public class User {
    private int id;
    private String name;
    private String passworld;
    private Date brithday;
}
