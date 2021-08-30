package com.jinlin.service.impl;

import com.jinlin.entity.Menu;
import com.jinlin.mapper.MenuMapper;
import com.jinlin.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jinlin.utils.MenuTreeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
@Autowired
private  MenuMapper menuMapper;
    @Override
    public List<Menu> buildMenuTree() {
        //尽量封装成一个其法,所有项目都能直接使用
        //1.先拿到查询的数据    必须要在权限中才能拿到
        //假设用户就叫admin
        String username="admin";
        List<Menu> menuList=menuMapper.getMenuListByUserName(username);
       List<Menu>  menus= MenuTreeBuilder.build(menuList);
        for (Menu menu: menus) {
            System.out.println(menu.toString()); }
         return menus;
    }
}
