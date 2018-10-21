package pl.sda.bestgroup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sda.bestgroup.domain.CreateMessageRequest;
import pl.sda.bestgroup.domain.Message;
import pl.sda.bestgroup.domain.repository.MessageRepository;

import pl.sda.bestgroup.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    private MessageRepository tweetRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public void createMessage(CreateMessageRequest request) {

        Message message = Message.builder()
                .time(request.getTime())
                .message(request.getMessage())
                .user(request.getUser())
                .build();

        tweetRepository.save(message);
    }

    @Override
    public Page<Message> findAllBy(Pageable pageable) {
        return tweetRepository.findAllBy(pageable);
    }
}

