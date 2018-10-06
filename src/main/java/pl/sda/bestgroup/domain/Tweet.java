package pl.sda.bestgroup.domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Tweet {
    @Id
    private String id;
    private String message;
    private LocalDateTime time;
}

