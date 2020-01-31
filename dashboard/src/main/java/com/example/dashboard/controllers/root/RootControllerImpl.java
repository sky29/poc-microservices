package com.example.dashboard.controllers.root;

import com.example.dashboard.services.root.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootControllerImpl implements RootController {

    @Autowired
    private RootService rootService;

    @Override
    public String showMessage() {
        return rootService.showMessage();
    }

    
}