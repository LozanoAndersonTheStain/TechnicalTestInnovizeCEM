package com.technical.test.technicaltestinnovizecem;

import com.technical.test.technicaltestinnovizecem.config.DataBaseConfig;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnicalTestInnovizeCemApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        DataBaseConfig.loadDatabaseProperties();
        SpringApplication.run(TechnicalTestInnovizeCemApplication.class, args);

        DataBaseConfig.getConnection();
    }
}
