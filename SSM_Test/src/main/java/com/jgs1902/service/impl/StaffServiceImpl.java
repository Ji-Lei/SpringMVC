package com.jgs1902.service.impl;

import com.jgs1902.dao.mapper.StaffMapper;
import com.jgs1902.pojo.Staff;
import com.jgs1902.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("staffService")
public class StaffServiceImpl implements StaffService {

    @Autowired
    @Qualifier("staffMapper")
    private StaffMapper mapper;

    @Override
    public Staff getStaff(String staffname) {
        return mapper.getStaff(staffname);
    }

    @Override
    public List<Staff> getStaffList() {
        return mapper.getStaffList();
    }

    @Override
    public Integer deleteStaff(String staffname) {
        return mapper.deleteStaff(staffname);
    }
}
