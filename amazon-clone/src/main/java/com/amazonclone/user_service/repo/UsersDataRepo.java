package com.amazonclone.user_service.repo;

import com.amazonclone.user_service.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersDataRepo extends JpaRepository<UserData, Long> {

    Optional<UserData> findUserDataByUsername(String username);
}
