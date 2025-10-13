package com.endpoint.endpoint.repository;

import com.endpoint.endpoint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
