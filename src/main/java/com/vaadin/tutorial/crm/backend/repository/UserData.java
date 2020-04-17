package com.vaadin.tutorial.crm.backend.repository;

import com.vaadin.tutorial.crm.backend.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserData extends JpaRepository<User, Long> {
    // @Query(value = "SELECT * FROM user WHERE name=name", nativeQuery = true)
    // List<Contact> findlist();
}