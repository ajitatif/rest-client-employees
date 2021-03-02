package org.acme.rest.service;
import org.acme.rest.repository.EmployeeRepository;
import org.acme.rest.entity.Employee;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class EmployeeService {

    @Inject
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return employeeRepository.listAll();
    }

    @Transactional
    public void addEmployee(Employee employee){
        employeeRepository.persist(employee);
    }

    public List<Employee> findById(Long id) {
        return employeeRepository.find(id);
    }

    
    
}
