package com.example.dashboard.controllers.greeting;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "#{ '${api.baseurl}' + '${api.version}' + '${api.resource.greeting}' }")
@PreAuthorize("hasAnyAuthority('ROLE_USER')")
public interface GreetingController {

    @GetMapping(value = "${api.resource.greeting.operation.get.greeting}")
    public ResponseEntity<String> showMessage();

}