package com.wn.cms.controller;

import com.wn.cms.pojo.User;
import com.wn.cms.service.UserSer;
import com.wn.cms.service.impl.UserSerImpl;
import com.wn.cms.tools.MyMD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCon {
    @Autowired
    UserSerImpl userSer;

    @RequestMapping("/login")
    public int login(String username, String userpwd) throws Exception {
        String pwd = MyMD5Util.getEncryptedPwd(userpwd);
        List<User> users = (List<User>) userSer.findAll().getData();
        System.out.println(username + "\t\t" + pwd);
        int a = 0;
        for (User user : users) {
            System.out.println("11111111111"+user.getUsername()+"\t"+user.getUserpwd());
            if (user.getUsername().equals(username) && user.getUserpwd().equals(pwd)) {
                System.out.println("成功");
               a=1;
               break;
            } else {
                System.out.println("222222222222"+user.getUsername()+"\t"+user.getUserpwd());
                System.out.println("错误");
               a=0;
            }
        }
        if (a==1) {
            return 1;
        } else {
            return 0;
        }
    }

    @RequestMapping("/adduser")
    public boolean addUser(String username,String userpwd,String userpwd2,String role,String realname,String remark) throws Exception {
        boolean a=false;
        if (userpwd.equals(userpwd2)){
            String pwd = MyMD5Util.getEncryptedPwd(userpwd);
            User user=new User(role,username,pwd,realname,remark);
            System.out.println(user);
            int i = userSer.addUser(user);
            if (i==1){
                a=true;
            }else {
                a=false;
            }
        }else {
            a=false;
        }
      return a;
    }

}

