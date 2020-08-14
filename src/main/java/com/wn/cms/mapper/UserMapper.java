package com.wn.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wn.cms.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    //登录  查询所有
}
