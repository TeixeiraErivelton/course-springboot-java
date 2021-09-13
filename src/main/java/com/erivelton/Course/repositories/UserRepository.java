package com.erivelton.Course.repositories;

import com.erivelton.Course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
