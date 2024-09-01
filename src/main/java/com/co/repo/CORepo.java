package com.co.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.Correspondence;

public interface CORepo extends JpaRepository<Correspondence, Integer>{

}
