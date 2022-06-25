package com.manal.jerrar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.manal.jerrar.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
