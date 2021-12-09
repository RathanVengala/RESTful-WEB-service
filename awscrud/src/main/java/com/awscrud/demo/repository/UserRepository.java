package com.awscrud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awscrud.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
