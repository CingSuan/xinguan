package com.jinlin.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jinlin.entity.User;
import com.jinlin.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.jinlin.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
//表示这个控制器要通过swagger生成api接口文档
@Api
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    @ApiOperation(value = "分页", notes = "详细描述")
    Result page() {
        Page<User> page = new Page<>(1, 3);
        Page<User> pageO = userService.page(page);

        return Result.ok().data("pageO", pageO);
    }
    @ApiOperation(value = "根据id查询用户",notes="详细描述")
    @GetMapping("/id")
    public Result getUserById(long id){
        User user = userService.getById(id);
        return Result.ok().data("user",user);
    }
}

