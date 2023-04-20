package com.educandoweb.course.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{

        User user1 = new User(null, "Maria Brow", "maria@gmail.com", "988888888", "123456");
        User user2 = new User(null, "Joao Paulo", "joao@gmail.com", "977777777", "1234567"); 

        userRepository.saveAll(Arrays.asList(user1, user2));

    }
}
