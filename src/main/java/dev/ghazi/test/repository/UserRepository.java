package dev.ghazi.test.repository;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import dev.ghazi.test.domain.User;

public interface UserRepository extends ListCrudRepository<User, Integer>, ListPagingAndSortingRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
