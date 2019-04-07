package com.techmonad.db.application;

import java.util.Date;
import java.util.stream.Stream;

import com.techmonad.db.infrastructure.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techmonad.db.domain.entity.User;

@Component
public class UserInitializer implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(UserInitializer.class);

    private final UserRepository userRepository;

    UserInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("A", "B", "C", "D", "E", "F", "G")
                .forEach(name -> userRepository.save(new User(name, new Date())));

        userRepository.findAll().forEach(user -> logger.info("User: {}", user));
    }

}
