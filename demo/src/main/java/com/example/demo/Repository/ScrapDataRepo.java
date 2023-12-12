package com.example.demo.Repository;

import com.example.demo.Entity.ScrapDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScrapDataRepo extends JpaRepository<ScrapDetail,Integer> {
    public ScrapDetail findByTitle(String title);
}
