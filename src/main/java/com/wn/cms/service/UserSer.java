package com.wn.cms.service;

import com.wn.cms.pojo.User;
import com.wn.cms.vo.UserVo;

public interface UserSer {
    //登录  查询所有
    public UserVo<User> findAll() throws Exception;
    int addUser(User user) throws Exception;
}
