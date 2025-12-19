package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServicePartRepository;

@Repository
public interface ServicePartRepository extends JpaRepository<ServicePartRepository,Integer>{
    
}