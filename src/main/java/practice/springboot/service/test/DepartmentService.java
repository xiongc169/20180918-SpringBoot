package practice.springboot.service.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.springboot.domain.test.Department;
import practice.springboot.domain.test.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepository;

    public Long addDepartment(Department dept) {
        deptRepository.save(dept);
        return dept.getId();
    }
}
