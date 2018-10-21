package pl.sda.bestgroup.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.sda.bestgroup.domain.CreateUserRequest;
import pl.sda.bestgroup.domain.EditUserRequest;
import pl.sda.bestgroup.domain.User;
import pl.sda.bestgroup.domain.repository.UserRepository;

public interface UserService {

    void createUser(CreateUserRequest request);

    User findByLogin(String login);

    Page<User> deleteUserById(String id,Pageable pageable);

    Page<User> findAllBy(Pageable pageable);

    void editUser(String id, EditUserRequest request);
}
