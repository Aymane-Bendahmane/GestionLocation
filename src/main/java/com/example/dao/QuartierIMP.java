package com.example.dao;


import com.example.entities.Quartier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuartierIMP extends JpaRepository<Quartier,Long> {
}
