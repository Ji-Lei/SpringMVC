package com.jgs1902.dao.mapper;

import com.jgs1902.pojo.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffMapper {
//    根据用户名查询
    public Staff getStaff(@Param("staffname")String staffname);
//    查询所有
    public List<Staff> getStaffList();
//    删除职员
    public Integer deleteStaff(@Param("staffname")String staffname);
}
