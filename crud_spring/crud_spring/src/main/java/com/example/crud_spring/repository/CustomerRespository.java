package com.example.crud_spring.repository;

import com.example.crud_spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends JpaRepository <Customer,Long>{

}
