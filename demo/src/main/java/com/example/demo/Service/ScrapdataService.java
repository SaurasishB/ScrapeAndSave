package com.example.demo.Service;

import com.example.demo.Entity.ScrapDetail;
import com.example.demo.Repository.ScrapDataRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        List<ScrapDetail> scrapDetailList = new ArrayList<>();
        try{
            scrapDetailList=scrapDataRepo.findByTitle(title);
        }catch(Exception e){
           log.error("not found title");
        }
         if(scrapDetailList.size()!=0){
             return scrapDetailList.get(0);
         }
         return null;
    }
    public final static Logger log = LoggerFactory.getLogger(ScrapdataService.class.getName());
}
