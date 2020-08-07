package com.example.dao;

import com.example.entities.Bien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BienIMP extends JpaRepository<Bien,Long> {
}
