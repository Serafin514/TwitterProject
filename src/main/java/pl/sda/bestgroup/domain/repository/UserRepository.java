package pl.sda.bestgroup.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import pl.sda.bestgroup.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByLogin(String login);

    Page<User> findAllBy(Pageable pageable);

    Page<User> deleteUserById(String id, Pageable pageable);

    User findById(String id);
}
