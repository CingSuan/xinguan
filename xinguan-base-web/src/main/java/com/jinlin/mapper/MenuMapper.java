package com.jinlin.mapper;

import com.jinlin.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
/**
 * 根据用户名查询菜单
 * @param
 * @return
 */
@Mapper
@Repository
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> getMenuListByUserName(String username);

}
