package com.example.uni.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uni.Model.Lecturer;

@Repository
public interface LecturerRepo extends JpaRepository<Lecturer, Integer> {

}
