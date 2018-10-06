package pl.sda.bestgroup.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.sda.bestgroup.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
