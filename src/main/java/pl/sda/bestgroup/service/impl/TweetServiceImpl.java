package pl.sda.bestgroup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sda.bestgroup.domain.CreateTweetRequest;
import pl.sda.bestgroup.domain.Tweet;
import pl.sda.bestgroup.domain.repository.TweetRepository;

import pl.sda.bestgroup.service.TweetService;
@Service
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

    @Override
    public Page<Tweet> findAllBy(Pageable pageable) {
        return tweetRepository.findAllBy(pageable);
    }
}

