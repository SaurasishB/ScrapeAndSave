package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

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
