package com.jinlin.service.impl;

import com.jinlin.entity.Menu;
import com.jinlin.mapper.MenuMapper;
import com.jinlin.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.velocity.runtime.directive.Foreach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<Menu> rootlist=menuMapper.getMenuListByUserName(username);
       rootlist.forEach(menu -> {
            System.out.println(menu.toString());
        });
        List<Menu> menulist=new ArrayList<>();
        for(int i=0;i<rootlist.size();i++){
            //说明这个菜单是一级菜单
         if(menulist.get(i).getParentId()==0){
          menulist.add(menulist.get(i));//设置了父级的菜单
         }
        }
        //接下来就是一级菜单下面的子菜单,getchild是递归调用的
        for (Menu menu:menulist){
     //获取一级菜单的子菜单
            menu.setChildMenus(getChild(menu.getId(),rootlist));
        }
        return menulist;
    }
    /**
     *id 父级id
     * rootlist 菜单的集合
     */
    private List<Menu> getChild(Long id,List<Menu> rootlist){
        //定义一个子菜单的集合
        List<Menu> childList=new ArrayList<>();
        //关注如何实现递归的
        for (Menu menu: rootlist){
            //menu.getParentid 表示父级id 刚好等于 一级菜单的id
            if(menu.getParentId().equals(id)){
            //这些菜单绝对是当前页面下的子菜单
                childList.add(menu);
            }
        }
        for (Menu menu:childList){
            menu.setChildMenus(getChild(menu.getId(),rootlist));
        }
        return childList;
    }
}
