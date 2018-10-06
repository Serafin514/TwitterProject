package pl.sda.bestgroup.controller;

import org.springframework.web.bind.annotation.RestController;
import pl.sda.bestgroup.service.TwitterService;

@RestController
public class TwitterController {

    TwitterService twitterService;

    public TwitterController(TwitterService twitterService) {
        this.twitterService = twitterService;
    }
}
