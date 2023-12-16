package com.example.demo.Entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ScrapDetail")
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ScrapDetail {

    @Id
    private int scrapId;
    private String title;
    private String price;
}
