package com.manal.jerrar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.manal.jerrar.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

