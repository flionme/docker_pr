package org.example.docker3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity test(){
        System.out.println("test");
        System.out.println("test");

        return ResponseEntity.status(200).body("테스트0");
    }

    @GetMapping("/health")
    public ResponseEntity health(){ return ResponseEntity.ok().build(); }
}
