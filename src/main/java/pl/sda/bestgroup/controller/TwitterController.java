package pl.sda.bestgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
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
}
