package pl.sda.bestgroup.service;

import org.springframework.stereotype.Service;
import pl.sda.bestgroup.domain.CreateTweetRequest;




@Service
public interface TweetService {

       void createTweet(CreateTweetRequest request);
}
