package dev.ghazi.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.ghazi.test.dto.UserRecord;
import dev.ghazi.test.mapper.UserMapper;
import dev.ghazi.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserRecord> findUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .toList();
    }
}
