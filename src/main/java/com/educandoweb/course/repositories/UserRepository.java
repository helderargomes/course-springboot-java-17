package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User2;

public interface UserRepository extends JpaRepository<User2, Long> {

}
