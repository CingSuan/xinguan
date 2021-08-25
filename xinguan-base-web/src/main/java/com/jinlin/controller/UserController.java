package com.jinlin.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jinlin.entity.User;
import com.jinlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/all")

    Page<User> page() {
        Page<User> page = new Page<>(1, 3);
        Page<User> pageO = userService.page(page);
        return pageO;
    }
}

