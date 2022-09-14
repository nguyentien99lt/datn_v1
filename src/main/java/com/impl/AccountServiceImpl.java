package com.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Accounts;
import com.repositories.AccountRepository;
import com.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accRepo;

	@Override
	public List<Accounts> findAll() {
		return (List<Accounts>) accRepo.findAll();
	}

	@Override
	public Optional<Accounts> findById(Integer id) {
		return accRepo.findById(id);
	}

	@Override
	public void save(Accounts acc) {
		accRepo.save(acc);
	}

	@Override
	public void delete(Integer id) {
		accRepo.deleteById(id);
	}
}
