package com.longhao.am.dao;

import com.longhao.am.entity.Check;
import com.longhao.am.entity.Salary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SalaryDao {
    int deleteById(String id);

    int insert(Salary record);

    Salary selectById(String id);

    int update(Salary record);

    Salary findByNumberAndMonth(Check check);
}