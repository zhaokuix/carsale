package com.zhaokuix.dao;

import com.zhaokuix.pojo.Employee;
import com.zhaokuix.vo.EmployeeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    int checkUserId(Integer id);

    Employee selectLogin(@Param("id") Integer id, @Param("password") String password);

    List<Employee> selectSelective(EmployeeQuery employeeQuery);

    String selectPasswordByPrimaryKey(Integer id);

    int updatePasswordByPrimaryKeyAndOldPass(@Param("id") Integer id, @Param("oldPass") String oldPass, @Param("newPass") String newPass);
}
