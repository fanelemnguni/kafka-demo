package za.co.minusone.kafkademo.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.minusone.kafkademo.dto.DemoDTO;
import za.co.minusone.kafkademo.listener.ExampleSender;

@RestController("/api")
public class ServiceController {
    @Autowired
    private ExampleSender exampleSender;

    @PostMapping
    public ResponseEntity postData(@RequestBody DemoDTO demoDTO){
        exampleSender.sendGreetingMessage(demoDTO);
        return new ResponseEntity("Success", HttpStatus.OK);
    }
}
