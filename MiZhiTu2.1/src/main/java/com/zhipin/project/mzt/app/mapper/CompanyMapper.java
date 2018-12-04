package com.zhipin.project.mzt.app.mapper;

import com.zhipin.project.mzt.app.domain.Company;

public interface CompanyMapper {
    //新增公司
    int insert(Company company);
    //修改
    int updateByPrimaryKeySelective(Company company);
    //根据主键id查询
    Company selectByPrimaryKey(Integer id);
    //根据主键删除
    int deleteByPrimaryKey(Integer id);
}
