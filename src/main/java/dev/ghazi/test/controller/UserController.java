package dev.ghazi.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ghazi.test.dto.UserRecord;
import dev.ghazi.test.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController extends BaseController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserRecord>> findUsers() {
        log.info("current user [{}], roles {}", currentUser(), roles());
        var users = userService.findUsers();
        return ResponseEntity.ok(users);
    }
}
