package com.zhaokuix.service.impl;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.dao.EmployeeMapper;
import com.zhaokuix.pojo.Employee;
import com.zhaokuix.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaokuix
 * @date 2018/12/27 9:56
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public ServerResponse<Employee> login(Integer userId, String password) {
        int resultCount = employeeMapper.checkUserId(userId);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        Employee employee = employeeMapper.selectLogin(userId, password);
        if (employee == null) {
            // 查询结果为空
            return ServerResponse.createByErrorMessage("密码错误");
        }
        employee.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", employee);
    }
}
