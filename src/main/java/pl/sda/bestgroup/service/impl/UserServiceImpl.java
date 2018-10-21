package pl.sda.bestgroup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sda.bestgroup.domain.CreateUserRequest;
import pl.sda.bestgroup.domain.User;
import pl.sda.bestgroup.domain.repository.UserRepository;
import pl.sda.bestgroup.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(CreateUserRequest request) {
        if (userRepository.findByLogin(request.getLogin()) != null) {
            throw new UserExistExeption("User Exist at database");
        }

        User user = User.builder()
                .userName(request.getUserName())
                .userSurname(request.getUserSurname())
                .birth(request.getBirth())
                .login(request.getLogin())
                .phoneNumber(request.getPhoneNumber())
                .password(request.getPassword())
                .build();

        userRepository.save(user);
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public Page<User> deleteUserById(String id, Pageable pageable) {
        return userRepository.deleteUserById(id, pageable);
    }


    public Page<User> findAllBy(Pageable pageable) {
        return userRepository.findAllBy(pageable);
    }



}
