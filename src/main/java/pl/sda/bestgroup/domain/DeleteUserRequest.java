package pl.sda.bestgroup.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@Validated
public class DeleteUserRequest {
    @NotNull
    private String id;
}
