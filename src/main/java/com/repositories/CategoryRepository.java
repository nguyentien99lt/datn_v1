package datn.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import datn.store.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
}
