package com.example.undeedma.dao.repositories;

import com.example.undeedma.dao.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Integer> {
}
