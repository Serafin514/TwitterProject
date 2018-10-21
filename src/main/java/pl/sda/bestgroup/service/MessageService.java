package pl.sda.bestgroup.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.sda.bestgroup.domain.CreateMessageRequest;
import pl.sda.bestgroup.domain.Message;

@Service
public interface MessageService {

       void createMessage(CreateMessageRequest request);

       Page<Message> findAllBy(Pageable pageable);

}
