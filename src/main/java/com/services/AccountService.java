package datn.store.service;

import java.util.List;
import java.util.Optional;

import datn.store.entity.Accounts;

public interface AccountService {
	List<Accounts> findAll();

	Optional<Accounts> findById(Integer id);

	void save(Accounts acc);

	void delete(Integer id);

}
