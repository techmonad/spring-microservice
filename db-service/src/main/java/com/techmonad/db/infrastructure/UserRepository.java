package com.techmonad.db.infrastructure;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.techmonad.db.domain.entity.User;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	List<User> findByName(@Param("name") String name);

}
