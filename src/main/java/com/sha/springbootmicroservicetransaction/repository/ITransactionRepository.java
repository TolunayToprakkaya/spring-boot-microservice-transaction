package com.sha.springbootmicroservicetransaction.repository;

import com.sha.springbootmicroservicetransaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByUserId(Long userId);
}
