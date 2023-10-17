package com.preparation.videoplayer.repository;

import com.preparation.videoplayer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
