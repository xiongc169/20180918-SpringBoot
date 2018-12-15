package practice.springboot.service.rehearsal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.springboot.domain.rehearsal.Department;
import practice.springboot.domain.rehearsal.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository deptRepository;

    public Department addDepartment(Department dept) {
        deptRepository.save(dept);
        return dept;
    }
}
