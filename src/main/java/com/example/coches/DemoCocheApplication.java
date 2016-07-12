package com.example.coches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoCocheApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(DemoCocheApplication.class, args);

        CocheService cocheService=context.getBean(CocheService.class);

        cocheService.testCoche();
    }
}
