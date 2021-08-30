package com.jinlin.service;

import com.jinlin.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
public interface MenuService extends IService<Menu> {


    List<Menu> buildMenuTree( );
}
