package com.wn.cms.service.impl;

import com.wn.cms.mapper.UserMapper;
import com.wn.cms.pojo.User;
import com.wn.cms.service.UserSer;
import com.wn.cms.vo.APPVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSerImpl implements UserSer {
    @Autowired
    UserMapper userMapper;
    @Override
    public APPVo<User> findAll() throws Exception {
        List list = userMapper.selectList(null);
        APPVo userVo=new APPVo();
        userVo.setCode(0);
        userVo.setMsg("");
        userVo.setCount(12345);
        userVo.setData(list);
        return userVo;
    }

    @Override
    public int addUser(User user) throws Exception {
        return userMapper.insert(user);
    }
}
