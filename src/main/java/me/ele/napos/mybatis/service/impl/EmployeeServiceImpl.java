package me.ele.napos.mybatis.service.impl;

import me.ele.napos.mybatis.dao.EleUserMapper;
import me.ele.napos.mybatis.model.EleUser;
import me.ele.napos.mybatis.model.EleUserExample;
import me.ele.napos.mybatis.service.EmployeeService;
import me.ele.napos.mybatis.struct.Employee;
import me.ele.napos.mybatis.struct.EmployeeCreation;
import me.ele.napos.mybatis.struct.transformers.EmployeeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakoo on 2016/11/23.
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired(required = false)
    private EleUserMapper eleUserMapper;

    public Employee getById(int id) {

        EleUser eleUser = eleUserMapper.selectByPrimaryKey(id);
        if(eleUser == null) {
            return null;
        }
        return EmployeeTransformer.toEmployee(eleUser);
    }

    public List<Employee> queryAll()  {
        EleUserExample example = new EleUserExample();
        List<EleUser> eleUsers = eleUserMapper.selectByExample(example);
        List<Employee> employees = new ArrayList<Employee>();
        for(EleUser user : eleUsers) {
            employees.add(EmployeeTransformer.toEmployee(user));
        }
        return employees;
    }


    public Employee create(EmployeeCreation creation) {
        EleUser user = new EleUser();
        user.setWechat(creation.getWechat());
        user.setEmployeeDepartment(creation.getDepartment());
        user.setEmployeeEmail(creation.getEmail());
        user.setEmployeeName(creation.getName());
        user.setEmployeePhone(creation.getPhone());
        user.setIdCard(creation.getCardId());

        return EmployeeTransformer.toEmployee(eleUserMapper.selectByPrimaryKey(eleUserMapper.insert(user)));
    }

    public void delete(int id) {
        eleUserMapper.deleteByPrimaryKey(id);
    }


}
