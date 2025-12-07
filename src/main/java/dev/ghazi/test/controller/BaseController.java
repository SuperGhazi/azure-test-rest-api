package dev.ghazi.test.controller;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

public abstract class BaseController {

    protected String currentUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    protected List<String> roles() {
        return SecurityContextHolder.getContext()
                .getAuthentication()
                .getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .toList();
    }
}
