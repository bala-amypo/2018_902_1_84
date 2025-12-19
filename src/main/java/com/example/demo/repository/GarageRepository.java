package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GarageRepository;

@Repository
public interface GarageRepository extends JpaRepository<GarageRepository,Integer>{
    
}