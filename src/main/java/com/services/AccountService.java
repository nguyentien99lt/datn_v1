package com.services;

import java.util.List;
import java.util.Optional;

import com.entities.Accounts;

public interface AccountService {
	List<Accounts> findAll();

	Optional<Accounts> findById(Integer id);

	void save(Accounts acc);

	void delete(Integer id);

}
