package com.example.crud_spring.service;

import com.example.crud_spring.entity.Customer;
import com.example.crud_spring.repository.CustomerRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRespository customerRespository;

    public Customer postCustomer(Customer customer) {
        return customerRespository.save(customer);
    }

}
