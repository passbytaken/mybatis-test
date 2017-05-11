package me.ele.napos.mybatis.struct.transformers;

import me.ele.napos.mybatis.model.EleUser;
import me.ele.napos.mybatis.struct.Employee;

/**
 * Created by jakoo on 2016/11/24.
 */
public class EmployeeTransformer {

    public static Employee toEmployee(EleUser user) {
        Employee employee = new Employee();
        employee.setId(user.getId());
        employee.setCardId(user.getIdCard());
        employee.setDepartment(user.getEmployeeDepartment());
        employee.setEmail(user.getEmployeeEmail());
        employee.setName(user.getEmployeeName());
        employee.setPhone(user.getEmployeePhone());
        employee.setWechat(user.getWechat());
        employee.setAddress(user.getAddress());
        employee.setPassportNum(user.getPassportNum());

        return employee;
    }
}
