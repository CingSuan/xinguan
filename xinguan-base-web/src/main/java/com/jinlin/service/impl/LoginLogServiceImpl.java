package com.jinlin.service.impl;

import com.jinlin.entity.LoginLog;
import com.jinlin.mapper.LoginLogMapper;
import com.jinlin.service.LoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志表 服务实现类
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

}
