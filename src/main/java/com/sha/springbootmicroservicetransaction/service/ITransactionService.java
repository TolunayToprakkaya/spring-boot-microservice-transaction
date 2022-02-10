package com.sha.springbootmicroservicetransaction.service;

import com.sha.springbootmicroservicetransaction.model.Transaction;

import java.util.List;

public interface ITransactionService {

    Transaction saveTransaction(Transaction transaction);
    List<Transaction> findAllTransactionsOfUser(Long userId);
    void deleteTransaction(Long transactionId);
}
