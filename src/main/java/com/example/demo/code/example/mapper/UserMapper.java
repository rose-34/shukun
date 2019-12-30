package com.example.demo.code.example.mapper;

import com.example.demo.code.example.entity.User;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author psk
 * @since 2019-12-18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
