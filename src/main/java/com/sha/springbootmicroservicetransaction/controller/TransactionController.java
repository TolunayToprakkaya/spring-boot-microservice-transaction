package com.sha.springbootmicroservicetransaction.controller;

import com.sha.springbootmicroservicetransaction.model.Transaction;
import com.sha.springbootmicroservicetransaction.service.ITransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    private final ITransactionService transactionService;

    public TransactionController(ITransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> findAllTransactionsOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(transactionService.findAllTransactionsOfUser(userId));
    }

    @DeleteMapping("/{transactionId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId) {
        transactionService.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
