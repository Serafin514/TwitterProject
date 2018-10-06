package pl.sda.bestgroup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.sda.bestgroup.domain.CreateTweetRequest;
import pl.sda.bestgroup.domain.Tweet;
import pl.sda.bestgroup.domain.repository.TweetRepository;

import pl.sda.bestgroup.service.TweetService;

public class TweetServiceImpl implements TweetService {

    private TweetRepository tweetRepository;

    @Autowired
    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public void createTweet(CreateTweetRequest request) {

        Tweet tweet = Tweet.builder()
                .time(request.getTime())
                .message(request.getMessage())
                .user(request.getUser())
                .build();

        tweetRepository.save(tweet);

    }

public Page<Tweet> getAllTweet (Pageable pageable){
return tweetRepository.findAllBy(pageable);
}

}

