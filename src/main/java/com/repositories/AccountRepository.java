package datn.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import datn.store.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {
}
