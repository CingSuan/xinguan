package com.jinlin.service.impl;

import com.jinlin.entity.UserRole;
import com.jinlin.mapper.UserRoleMapper;
import com.jinlin.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
