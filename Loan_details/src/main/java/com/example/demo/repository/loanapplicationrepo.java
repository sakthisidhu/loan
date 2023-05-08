package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.loanapplicationmodel;

public interface loanapplicationrepo extends JpaRepository<loanapplicationmodel, Integer> {

}
