package com.jinlin.service.impl;

import com.jinlin.entity.User;
import com.jinlin.mapper.UserMapper;
import com.jinlin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
