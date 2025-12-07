package dev.ghazi.test.dto;

import java.util.Set;

public record UserRecord(
    Integer id,
    String firstName,
    String lastName,
    String email,
    Set<String> roles
) {

}
