package pl.sda.bestgroup.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import pl.sda.bestgroup.domain.Message;

public interface MessageRepository extends MongoRepository<Message, String> {

    Page<Message> findAllBy(Pageable pageable);
}
