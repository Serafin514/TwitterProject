package pl.sda.bestgroup.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.sda.bestgroup.domain.CreateMessageRequest;
import pl.sda.bestgroup.domain.Message;


public interface MessageService {

       void createMessage(CreateMessageRequest request);

       Page<Message> findAllBy(Pageable pageable);

}
