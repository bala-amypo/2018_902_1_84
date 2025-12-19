package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServiceEntryRepository;

@Repository
public interface ServiceEntryRepository extends JpaRepository<ServiceEntryRepository,Integer>{
    
}