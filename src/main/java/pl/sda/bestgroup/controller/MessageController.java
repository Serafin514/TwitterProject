package pl.sda.bestgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sda.bestgroup.domain.CreateMessageRequest;
import pl.sda.bestgroup.domain.Message;
import pl.sda.bestgroup.service.MessageService;

import javax.validation.Valid;

@RestController
public class MessageController {

    MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PutMapping("/message/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMessage(@RequestBody @Valid CreateMessageRequest request) {
        messageService.createMessage(request);
    }

    @GetMapping("/message/all")
    public Page<Message> getAllMessage(@PageableDefault(size = 4) Pageable pageable) {
        return messageService.findAllBy(pageable);
    }

}
