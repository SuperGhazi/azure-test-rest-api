package dev.ghazi.test.domain;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table("USERS")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    private Integer id;

    @Column("FIRST_NAME")
    private String firstName;

    @Column("LAST_NAME")
    private String lastName;

    private String email;

    private String password;

    @MappedCollection(idColumn = "USER_ID")
    private Set<UserRole> roles;
}
