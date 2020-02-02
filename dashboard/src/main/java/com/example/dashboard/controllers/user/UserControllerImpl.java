package com.example.dashboard.controllers.user;

import java.util.Set;

import com.example.dashboard.config.security.SecurityContextUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {

    @Override
    public ResponseEntity<String> getAuthorizedUserName() {
        return ResponseEntity.ok(SecurityContextUtils.getUserName());
    }

    @Override
    public ResponseEntity<Set<String>> getAuthorizedUserRoles() {
        return ResponseEntity.ok(SecurityContextUtils.getUserRoles());
    }
    
}