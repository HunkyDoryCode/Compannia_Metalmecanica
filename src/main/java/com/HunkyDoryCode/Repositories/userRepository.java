package com.HunkyDoryCode.Repositories;

import com.HunkyDoryCode.Entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface userRepository extends JpaRepository<user, Long> {
    user findByEmail(String email);

}
