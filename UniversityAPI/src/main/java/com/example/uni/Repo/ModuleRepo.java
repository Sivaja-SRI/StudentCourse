package com.example.uni.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uni.Model.Module;

@Repository
public interface ModuleRepo  extends JpaRepository<Module, Integer>{

}
