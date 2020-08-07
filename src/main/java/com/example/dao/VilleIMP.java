package com.example.dao;

import com.example.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleIMP extends JpaRepository<Ville,Long> {
}
