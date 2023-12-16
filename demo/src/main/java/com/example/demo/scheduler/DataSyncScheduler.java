package com.example.demo.scheduler;

import com.example.demo.Entity.ScrapDetail;
import com.example.demo.Service.ScrapdataService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
public class DataSyncScheduler {


    @Scheduled(fixedRate = 5000000)
    public void Scraping(){
        String url = "https://books.toscrape.com/";
        log.error("started");
        try {
            Document document = Jsoup.connect(url).get();
            //document isthe hole ducument from where i need the data

            Elements books = document.select(".product_pod");
            int i=0;
            for(Element book : books){
                String title = book.select("h3 > a").text();
                String price = book.select(".price_color").text();

                log.error(title + " " + price);
                ScrapDetail scrapDetail = new ScrapDetail();
                scrapDetail.setScrapId(i++);
                scrapDetail.setTitle(title);
                scrapDetail.setPrice(price);
                scrapdataService.addScrapData(scrapDetail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final static Logger log = LoggerFactory.getLogger(DataSyncScheduler.class.getName());

    @Autowired
    ScrapdataService scrapdataService;
}
