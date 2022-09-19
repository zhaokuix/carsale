package com.zhaokuix.dao;

import com.zhaokuix.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhaokuix
 * @date 2018/12/25 20:31
 */
@SpringBootTest
public class EmployeeMapperTest {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void selectByPrimaryKey() {
        Employee employee = employeeMapper.selectByPrimaryKey(123456);
        System.out.println(employee.toString());
    }
}
