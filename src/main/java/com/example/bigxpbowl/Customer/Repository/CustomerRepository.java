package com.example.bigxpbowl.Customer.Repository;

import com.example.bigxpbowl.Customer.Model.*;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerModel, Long>
{

}
