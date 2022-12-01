package com.example.bigxpbowl.Customer.Service;

import com.example.bigxpbowl.Customer.Model.CustomerModel;
import org.springframework.data.repository.CrudRepository;

public class CustomerService
{
    private final CrudRepository<CustomerModel, Long> repository;

    public CustomerService(CrudRepository<CustomerModel, Long> repository)
    {
        this.repository = repository;
    }

    public Iterable<CustomerModel> showAllCustomers()
    {
        return repository.findAll();
    }

    public CustomerModel create(CustomerModel customer)
    {
        return repository.save(customer);
    }
}
