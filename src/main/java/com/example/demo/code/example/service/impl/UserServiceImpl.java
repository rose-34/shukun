package com.example.demo.code.example.service.impl;

import com.example.demo.code.example.entity.User;
import com.example.demo.code.example.mapper.UserMapper;
import com.example.demo.code.example.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author psk
 * @since 2019-12-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
