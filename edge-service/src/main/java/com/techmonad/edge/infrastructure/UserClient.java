package com.techmonad.edge.infrastructure;

import com.techmonad.edge.domain.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("db-service")
public interface UserClient {

	@GetMapping("/users")
	Resources<User> readUsers();

}
