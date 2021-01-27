package com.yoong.accidence.core.service.rehearsal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yoong.accidence.core.domain.rehearsal.Department;
import com.yoong.accidence.core.domain.rehearsal.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepository;

    public Department addDepartment(Department dept) {
        deptRepository.save(dept);
        return dept;
    }
}
