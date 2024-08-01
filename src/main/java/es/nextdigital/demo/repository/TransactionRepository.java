package es.nextdigital.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.nextdigital.demo.entity.Account;
import es.nextdigital.demo.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByAccount(Account account);

}
