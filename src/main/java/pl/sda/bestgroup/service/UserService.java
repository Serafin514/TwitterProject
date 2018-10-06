package pl.sda.bestgroup.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.sda.bestgroup.domain.CreateUserRequest;
import pl.sda.bestgroup.domain.User;

public interface UserService {

    void createUser(CreateUserRequest request);

    User findByLogin(String login);

    Page<User> findAllBy(Pageable pageable);
}
