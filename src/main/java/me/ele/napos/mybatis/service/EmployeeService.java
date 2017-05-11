package me.ele.napos.mybatis.service;
import me.ele.napos.mybatis.struct.Employee;
import me.ele.napos.mybatis.struct.EmployeeCreation;

import java.util.List;

/**
 * Created by jakoo on 2016/11/23.
 *
 */


public interface EmployeeService {
    Employee getById(int id);

    List<Employee> queryAll();

    Employee create(EmployeeCreation creation);

    void delete(int id);

}
