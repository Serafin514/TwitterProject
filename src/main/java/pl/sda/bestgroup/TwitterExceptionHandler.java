package pl.sda.bestgroup;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.sda.bestgroup.exeptions.UserExistExeption;

@RestControllerAdvice
public class TwitterExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = UserExistExeption.class)
    public ResponseEntity<Object> handleAutoNotFoundException(WebRequest request, UserExistExeption e) {
        return handleExceptionInternal(e, e.getMessage(), null, HttpStatus.NOT_FOUND, request);
    }
}
