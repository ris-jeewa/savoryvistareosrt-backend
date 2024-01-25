package com.savoryvistaresort.savoryvistaresort.repository;


import com.savoryvistaresort.savoryvistaresort.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
