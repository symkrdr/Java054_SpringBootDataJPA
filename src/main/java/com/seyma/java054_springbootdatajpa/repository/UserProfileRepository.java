package com.seyma.java054_springbootdatajpa.repository;

import com.seyma.java054_springbootdatajpa.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
