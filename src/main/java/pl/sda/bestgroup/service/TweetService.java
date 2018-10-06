package pl.sda.bestgroup.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sda.bestgroup.domain.CreateTweetRequest;
import pl.sda.bestgroup.domain.Tweet;

@Service
public interface TweetService {

       void createTweet(CreateTweetRequest request);

       Page<Tweet> findAllBy(Pageable pageable);

}
