package com.example.undeedma.dao.repositories;

import com.example.undeedma.dao.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Integer> {
}
