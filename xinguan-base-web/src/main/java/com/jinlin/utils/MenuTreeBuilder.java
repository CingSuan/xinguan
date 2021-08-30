package com.jinlin.utils;

import com.jinlin.entity.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 构建树形菜单的类
 */
public class MenuTreeBuilder {

    public static List<Menu> build(List<Menu> menuList){
        //定义一个最后的结果
        List<Menu> menus = new ArrayList<>();  //null

        //如果菜单里面的parentId = 0,则是一级菜单
        for (int i = 0;i<menuList.size();i++){
            //说明这个菜单是一级菜单
            if(menuList.get(i).getParentId()==0){
                menus.add(menuList.get(i));  //设置了父级的菜单
            }
        }

        //接下来就是要拿到一级菜单下面的子菜单
        // 为一级菜单设置子菜单，getChild是递归调用的
        for (Menu menu : menus) {
            //获取一级菜单的子菜单
            menu.setChildMenus(getChild(menu.getId(), menuList));
        }
        //要对集合进行排序
        Collections.sort(menus,Menu.order());
        return menus;
    }

    /**
     *
     * @param id  父级id
     * @param menuList 菜单的集合
     * @return
     */
    private static List<Menu> getChild(Long id, List<Menu> menuList) {
        //定义一个子菜单的集合
        List<Menu> childList = new ArrayList<>();

        //关注如何实现递归的
        for (Menu menu : menuList) {
            if(menu.getParentId() != 0){
                //menu.getParentId() 表示父级id 刚好等于  一级菜单的id
                if(menu.getParentId().equals(id)  && menu.getType().equals("0")){
                    //这些菜单绝对是当前id下面的子菜单
                    childList.add(menu);

                }
            }
        }

        //要对集合进行排序
        Collections.sort(childList,Menu.order());

        // 把子菜单的子菜单再循环一遍
        for (Menu menu : childList) {
            //这里就是递归了
            menu.setChildMenus(getChild(menu.getId(), menuList));
        }

        //退出递归
        if (childList.size()==0){
            return null;
        }

        return childList;
    }
}
