package com.project2.repository;

import com.project2.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
    Optional<AppUser> findByUsername(String username);
}