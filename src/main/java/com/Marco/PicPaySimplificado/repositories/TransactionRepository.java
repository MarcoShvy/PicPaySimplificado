package com.Marco.PicPaySimplificado.repositories;

import com.Marco.PicPaySimplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
