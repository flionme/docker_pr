package org.example.docker3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity test(){
        System.out.println("test");
        return ResponseEntity.status(200).body("Test code");
    }
}
