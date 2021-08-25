package com.jinlin.service.impl;

import com.jinlin.entity.Log;
import com.jinlin.mapper.LogMapper;
import com.jinlin.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author NieChangan
 * @since 2021-08-25
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
