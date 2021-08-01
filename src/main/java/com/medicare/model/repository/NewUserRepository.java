package com.medicare.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.model.NewUserReg;

public interface NewUserRepository extends JpaRepository<NewUserReg, Integer> {

}
