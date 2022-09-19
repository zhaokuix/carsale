package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Employee;

/**
 * @author zhaokuix
 * @date 2018/12/27 9:53
 */
public interface IUserService {

    ServerResponse<Employee> login(Integer userId, String password);
}
