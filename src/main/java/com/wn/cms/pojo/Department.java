package com.wn.cms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Mr.L
 * @version 1.0
 * @date 2020/8/14 0014 15:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Department {
    private String deptid;
    private String deptname;
    private String deptremark;
}
