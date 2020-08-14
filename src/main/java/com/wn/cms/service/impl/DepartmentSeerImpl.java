package com.wn.cms.service.impl;

import com.wn.cms.mapper.DepartmentMapper;
import com.wn.cms.pojo.Department;
import com.wn.cms.service.DepartmentSer;
import com.wn.cms.vo.APPVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mr.L
 * @version 1.0
 * @date 2020/8/14 0014 15:54
 */
@Service
public class DepartmentSeerImpl implements DepartmentSer {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public APPVo<Department> findAll() {
        APPVo<Department> departmentAPPVo = new APPVo<>();
        departmentAPPVo.setCode(0);
        departmentAPPVo.setMsg("");
        departmentAPPVo.setCount(123l);
        departmentAPPVo.setData(departmentMapper.selectList(null));

        return departmentAPPVo;
    }
}
