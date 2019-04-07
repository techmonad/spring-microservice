package com.techmonad.edge.presentation;

import java.util.Collection;
import java.util.stream.Collectors;

import com.techmonad.edge.domain.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmonad.edge.infrastructure.UserClient;

@RestController
public class UserController {

	private final UserClient userClient;

	public UserController(UserClient userClient) {
		this.userClient = userClient;
	}

	@GetMapping("/users")
	public Collection<User> goodItems() {
		return userClient.readUsers().getContent().stream().collect(Collectors.toList());
	}

}
