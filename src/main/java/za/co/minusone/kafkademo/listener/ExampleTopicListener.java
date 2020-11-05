package za.co.minusone.kafkademo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import za.co.minusone.kafkademo.dto.DemoDTO;

@Component
@Slf4j
public class ExampleTopicListener {
    @KafkaListener(topics = "${message.topic.name}", containerFactory = "exampleKafkaListenerContainerFactory")
    public void greetingListener(DemoDTO message) {
        log.info(message.toString());
    }
}
