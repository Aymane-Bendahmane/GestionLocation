package com.example.dao;

import com.example.entities.Proposition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropositionIMP extends JpaRepository<Proposition,Long> {
}
