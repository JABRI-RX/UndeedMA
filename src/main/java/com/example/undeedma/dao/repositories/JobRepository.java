package com.example.undeedma.dao.repositories;

import com.example.undeedma.dao.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRepository extends JpaRepository<Job, Integer> {
}
