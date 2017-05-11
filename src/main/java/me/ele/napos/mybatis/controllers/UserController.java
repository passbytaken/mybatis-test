package me.ele.napos.mybatis.controllers;

import me.ele.napos.mybatis.service.EmployeeService;
import me.ele.napos.mybatis.struct.Employee;
import me.ele.napos.mybatis.struct.EmployeeCreation;
import me.ele.napos.mybatis.struct.EmployeeResult;
import me.ele.napos.mybatis.struct.StatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jakoo on 2016/11/23.
 *
 */
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value = "user/{id}")
    public EmployeeResult getById(@PathVariable int id) {
        Employee employee = employeeService.getById(id);

        if(employee == null) {
            return new EmployeeResult(StatusType.EXCEPTION, "用户名不存在");
        }

        EmployeeResult result = new EmployeeResult(StatusType.SUCCESS);
        result.setEmployee(employee);
        return result;
    }

    @RequestMapping(value = "queryAll")
    public Map<String,Object> queryAll() {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result", employeeService.queryAll());
        return map;
    }




    @RequestMapping(value = "create", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public EmployeeResult create(@RequestBody EmployeeCreation creation) {
        if(creation == null) {
            return new EmployeeResult(StatusType.EXCEPTION, "输入信息不合法");
        }

        if(StringUtils.isEmpty(creation.getName())) {
            return new EmployeeResult(StatusType.EXCEPTION, "用户名不能为空");
        }

        EmployeeResult result = new EmployeeResult(StatusType.SUCCESS);
        result.setEmployee(employeeService.create(creation));
        return result;
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public void delete(@RequestBody int id){
        employeeService.delete(id);
    }




}
