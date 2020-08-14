package com.wn.cms.controller;

import com.wn.cms.pojo.Department;
import com.wn.cms.service.DepartmentSer;
import com.wn.cms.vo.APPVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr.L
 * @version 1.0
 * @date 2020/8/14 0014 15:59
 */
@RestController
public class DepartmentCon {

    @Autowired
    DepartmentSer departmentSer;
    @RequestMapping("department/getAll")
    public APPVo<Department> getAll(){
        return departmentSer.findAll();
    }
}
