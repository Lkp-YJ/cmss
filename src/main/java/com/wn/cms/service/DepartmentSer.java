package com.wn.cms.service;

import com.wn.cms.pojo.Department;
import com.wn.cms.vo.APPVo;

/**
 * @author Mr.L
 * @version 1.0
 * @date 2020/8/14 0014 15:48
 */
public interface DepartmentSer {
    APPVo<Department> findAll();
}
