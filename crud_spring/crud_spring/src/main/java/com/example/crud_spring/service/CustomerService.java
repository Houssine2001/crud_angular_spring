package com.example.crud_spring.service;

import com.example.crud_spring.entity.Customer;
import com.example.crud_spring.repository.CustomerRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRespository customerRespository;

    public Customer postCustomer(Customer customer) {
        return customerRespository.save(customer);
    }

    public List<Customer> getAllCustomer() {
         return customerRespository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRespository.findById(id).orElse(null);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRespository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRespository.deleteById(id);
    }

}
