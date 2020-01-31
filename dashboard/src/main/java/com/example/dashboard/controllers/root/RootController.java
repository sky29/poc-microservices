package com.example.dashboard.controllers.root;

import org.springframework.web.bind.annotation.GetMapping;

public interface RootController {

    @GetMapping("/")
    String showMessage();
}