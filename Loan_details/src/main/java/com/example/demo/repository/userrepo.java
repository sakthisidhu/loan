package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.usermodel;

public interface userrepo extends JpaRepository<usermodel, Integer> {

}
