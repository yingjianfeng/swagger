package com.yingjf.controller;

import com.yingjf.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Api(tags = {"用户操作接口"}, value = "value", description = "description")
public class UserController {


    @GetMapping("/getUser")
    @ApiOperation(value = "获取用户信息", notes = "注意问题点")
    public User getUser() {
        User user = new User().setName("应剑锋").setId(5).setBrithday(new Date()).setPassworld("passworld");
        return user;
    }


    @PostMapping("/login")
    @ApiOperation(value = "用户登录", notes = "注意问题点")
    public String login(@RequestBody Map map) {
        System.out.println(map);
        return "登录成功"+map;
    }

    @PutMapping("/updateUserInfo")
    @ApiOperation(value = "用户信息修改", notes = "注意问题点")
    public String updateUserInfo(@RequestBody User user) {
        return "用户信息修改成功"+user;
    }

    @DeleteMapping("/delUser/{id}")
    @ApiOperation(value = "删除用户", notes = "注意问题点")
    public String delUser(@PathVariable int id) {
        return "删除用户成功: "+id;
    }

}
