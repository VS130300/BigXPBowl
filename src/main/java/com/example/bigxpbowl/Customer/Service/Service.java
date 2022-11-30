package com.example.bigxpbowl.Customer.Service;
import com.example.bigxpbowl.Customer.Model.Customer;
import org.springframework.data.repository.CrudRepository;

public class Service
{
    private final CrudRepository<Customer, Long> repository;

    public CustomerService (CrudRepository<Customer, Long>{this.repository = repository;})

    public Iterable<Customer> showAllCustomers(){return repository.findAll();}

    public Customer create(Customer customer){
        return repository.save(customer);
    }
 }
