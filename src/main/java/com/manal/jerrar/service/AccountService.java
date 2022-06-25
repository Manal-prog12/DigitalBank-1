package com.manal.jerrar.service;

import java.security.Principal;

import com.manal.jerrar.domain.PrimaryAccount;
import com.manal.jerrar.domain.PrimaryTransaction;
import com.manal.jerrar.domain.SavingsAccount;
import com.manal.jerrar.domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
