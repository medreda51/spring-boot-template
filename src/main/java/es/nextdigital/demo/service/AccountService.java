package es.nextdigital.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.nextdigital.demo.entity.Account;
import es.nextdigital.demo.entity.Transaction;
import es.nextdigital.demo.repository.AccountRepository;
import es.nextdigital.demo.repository.TransactionRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }

    public List<Transaction> getAccountTransactions(Long accountId) {
        Account account = accountRepository.findById(accountId).orElseThrow();
        return transactionRepository.findByAccount(account);
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
