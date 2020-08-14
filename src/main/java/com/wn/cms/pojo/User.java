package com.wn.cms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userid;
    private String userrole;
    private String username;
    private String userpwd;
    private String realname;
    private String status = "1";
    private String userremark;
}
