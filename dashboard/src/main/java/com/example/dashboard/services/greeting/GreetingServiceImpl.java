package com.example.dashboard.services.greeting;

import com.example.dashboard.models.greeting.GreetingModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingModel greetingModel;

    @Override
    public String showMessage() {
        return greetingModel.getMessage();
    }

    

}