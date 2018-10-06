package pl.sda.bestgroup.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController {

    TwitterController twitterController;

    public TwitterController(TwitterController twitterController) {
        this.twitterController = twitterController;
    }
}
