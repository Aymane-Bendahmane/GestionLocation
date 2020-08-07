package com.example.dao;

import com.example.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeIMP extends JpaRepository<Type,Long> {
}
