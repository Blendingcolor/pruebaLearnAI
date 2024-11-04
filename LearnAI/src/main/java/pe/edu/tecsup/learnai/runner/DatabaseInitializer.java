package pe.edu.tecsup.learnai.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe.edu.tecsup.learnai.entity.User;
import pe.edu.tecsup.learnai.service.UserService;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) {
        if (!userService.getUsers().isEmpty()) {
            return;
        }
        USERS.forEach(userService::saveUser);
        log.info("Database initialized with user data");
    }

    private static final List<User> USERS = Arrays.asList(
            new User("john_doe", "john.doe@example.com", "password123"),
            new User("jane_smith", "jane.smith@example.com", "password456")
    );
}
