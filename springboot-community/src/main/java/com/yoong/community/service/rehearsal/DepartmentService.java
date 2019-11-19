package com.yoong.community.service.rehearsal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yoong.community.domain.rehearsal.Department;
import com.yoong.community.domain.rehearsal.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepository;

    public Department addDepartment(Department dept) {
        deptRepository.save(dept);
        return dept;
    }
}
