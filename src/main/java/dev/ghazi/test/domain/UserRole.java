package dev.ghazi.test.domain;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table("USER_ROLES")
@Getter
@Setter
@NoArgsConstructor
public class UserRole {

    private String role;
}
