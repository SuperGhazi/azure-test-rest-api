package dev.ghazi.test.mapper;

import java.util.stream.Collectors;

import dev.ghazi.test.domain.User;
import dev.ghazi.test.domain.UserRole;
import dev.ghazi.test.dto.UserRecord;

public class UserMapper {

    private UserMapper() {
        // Private constructor to prevent instantiation
    }

    public static UserRecord toDTO(User user) {
        return new UserRecord(
            user.getId(),
            user.getFirstName(),
            user.getLastName(),
            user.getEmail(),
            user.getRoles().stream().map(UserRole::getRole).collect(Collectors.toSet())
        );
    }
}
