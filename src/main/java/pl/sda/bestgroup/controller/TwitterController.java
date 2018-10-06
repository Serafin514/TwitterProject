package pl.sda.bestgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sda.bestgroup.domain.CreateTweetRequest;
import pl.sda.bestgroup.domain.Tweet;
import pl.sda.bestgroup.service.TweetService;

@RestController
public class TwitterController {

    TweetService tweetService;

    @Autowired
    public TwitterController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @PutMapping("/tweet/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createTweet(@RequestBody CreateTweetRequest request) {
        tweetService.createTweet(request);
    }

    @GetMapping("/tweet/all")
    public Page<Tweet> getAllTweets(@PageableDefault(size = 4) Pageable pageable) {
        return tweetService.findAllBy(pageable);
    }

}
