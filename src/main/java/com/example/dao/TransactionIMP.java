package com.example.dao;


import com.example.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionIMP extends JpaRepository<Transaction,Long> {
}
