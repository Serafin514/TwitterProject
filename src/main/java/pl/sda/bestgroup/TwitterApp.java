package pl.sda.bestgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TwitterApp {
    private static Class applicationClass = TwitterApp.class;

    public static void main(String[] args) {
        SpringApplication.run(TwitterApp.class, args);
    }
}
