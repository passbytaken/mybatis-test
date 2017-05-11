package me.ele.napos.mybatis.struct;

/**
 * Created by jakoo on 2016/11/25.
 */
public class EmployeeResult {
    private int status;
    private Employee employee;
    private String message;

    public EmployeeResult(StatusType status) {
        this.status = status.getCode();
    }

    public EmployeeResult(StatusType status, String message) {
        this.status = status.getCode();
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
