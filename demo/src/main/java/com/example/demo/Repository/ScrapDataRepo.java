package com.example.demo.Repository;

import com.example.demo.Entity.ScrapDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScrapDataRepo extends JpaRepository<ScrapDetail,Integer> {
    public List<ScrapDetail> findByTitle(String title);
}
