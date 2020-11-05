package za.co.minusone.kafkademo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import za.co.minusone.kafkademo.dto.DemoDTO;

@Component
public class ExampleSender {
    @Value(value = "${message.topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, DemoDTO> greetingKafkaTemplate;

    public void sendGreetingMessage(DemoDTO greeting) {
        greetingKafkaTemplate.send(topicName, greeting);
    }
}
