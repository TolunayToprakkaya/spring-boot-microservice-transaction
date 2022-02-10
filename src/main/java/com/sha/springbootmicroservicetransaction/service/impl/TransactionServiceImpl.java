package com.sha.springbootmicroservicetransaction.service.impl;

import com.sha.springbootmicroservicetransaction.model.Transaction;
import com.sha.springbootmicroservicetransaction.repository.ITransactionRepository;
import com.sha.springbootmicroservicetransaction.service.ITransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements ITransactionService {

    private final ITransactionRepository transactionRepository;

    public TransactionServiceImpl(ITransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        transaction.setTransactionTime(LocalDateTime.now());

        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAllTransactionsOfUser(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }

    @Override
    public void deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }
}
