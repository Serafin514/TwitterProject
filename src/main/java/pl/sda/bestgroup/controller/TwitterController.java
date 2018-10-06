package pl.sda.bestgroup;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController {

    TwitterController twitterController;

    public TwitterController(TwitterController twitterController) {
        this.twitterController = twitterController;
    }
}
