package com.rozkurt.Security.dataAccess;

import com.rozkurt.Security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
