package com.jinlin.controller;


import com.jinlin.entity.Menu;
import com.jinlin.response.Result;

import com.jinlin.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
@Api
@CrossOrigin
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

@ApiOperation(value = "加载菜单树",notes="获取所有菜单树")
    @GetMapping("/getTree")
    public Result tree(){
    List<Menu> menuTree= menuService.buildMenuTree();
    for (Menu mm:menuTree
         ) {
        System.out.println(mm.toString()+12312);

    }
  return Result.ok().data("menuTree",menuTree);
}
}

