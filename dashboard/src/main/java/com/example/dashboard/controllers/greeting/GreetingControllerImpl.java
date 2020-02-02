package com.example.dashboard.controllers.greeting;

import com.example.dashboard.services.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerImpl implements GreetingController {

    @Autowired
    private GreetingService greetingService;

    @Override
    public ResponseEntity<String> showMessage() {
        return ResponseEntity.ok(greetingService.showMessage());
    }
    
}