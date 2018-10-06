package pl.sda.bestgroup.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import pl.sda.bestgroup.domain.Tweet;

public interface TweetRepository extends MongoRepository<Tweet, String> {

    Page<Tweet> findAllBy(Pageable pageable);
}
