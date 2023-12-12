package com.example.demo.Service;

import com.example.demo.Entity.ScrapDetail;
import com.example.demo.Repository.ScrapDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ScrapdataService {

    @Autowired
    private ScrapDataRepo scrapDataRepo;
    @Autowired
    private ScrapDetail scrapDetail;


    public ScrapDetail addScrapData( ScrapDetail scrapDetail){
        return scrapDataRepo.save(scrapDetail);
    }

    public ScrapDetail findBytitle(String title){
        return scrapDataRepo.findByTitle(title);
    }
}
