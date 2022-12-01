package com.example.bigxpbowl.Employee.Service;

import com.example.bigxpbowl.Employee.Model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public class EmployeeService
{
    private final CrudRepository<EmployeeModel, Long> repository;

    public EmployeeService(CrudRepository<EmployeeModel, Long> repository)
    {
        this.repository = repository;
    }

    public Iterable<EmployeeModel> showAllEmployees()
    {
        return repository.findAll();
    }

    public EmployeeModel create(EmployeeModel employee)
    {
        return repository.save(employee);
    }
}
