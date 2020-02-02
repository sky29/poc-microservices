package com.example.dashboard.controllers.user;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "#{ '${api.baseurl}' + '${api.version}' + '${api.resource.user}' }")
@PreAuthorize("hasAnyAuthority('ROLE_USER')")
public interface UserController {

    @GetMapping(value = "${api.resource.user.operation.get.username}")
    public ResponseEntity<String> getAuthorizedUserName();

    @GetMapping(value = "${api.resource.user.operation.get.roles}")
    public ResponseEntity<Set<String>> getAuthorizedUserRoles();
}