package com.example.dashboard.models.greeting;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data
@NoArgsConstructor
public class GreetingModel {

    @Getter @Setter
    private String message = "You are now accessing Dashboard APIs";
}