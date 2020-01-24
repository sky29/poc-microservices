package com.example.market.controllers.root;

import com.example.market.services.root.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootControllerImpl implements RootController {

    @Autowired
    private RootService rootService;

    @Override
    @GetMapping("/")
    public String showMessage() {
        return rootService.showMessage();
    }

    
}