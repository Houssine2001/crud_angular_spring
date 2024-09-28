package com.example.crud_spring.controller;

import com.example.crud_spring.entity.Customer;
import com.example.crud_spring.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CustomerController {


     private final CustomerService customerService;


     @PostMapping("/customer")
    public Customer postCostumer(@RequestBody Customer customer) {
         return customerService.postCustomer(customer);
     }
}
