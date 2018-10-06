package pl.sda.bestgroup.domain;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Twitter {
    @Id
    private String id;
    private String message;
    private LocalDateTime time;
}
