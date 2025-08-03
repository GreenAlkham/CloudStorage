package ru.netology;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudStorageApplication {
    private static final Logger logger = LogManager.getLogger(CloudStorageApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CloudStorageApplication.class, args);
        logger.info("App is running");
    }
}