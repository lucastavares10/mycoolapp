package com.springboot.demo.mycoolapp.services;

import com.springboot.demo.mycoolapp.domain.Coach;
import com.springboot.demo.util.IDateParser;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Primary // In case to exists multiples Coach implementations, this will be the first choice if there is no qualifiers defined in controllers (Qualifiers have high priority)
public class BaseballCoach implements Coach {

    @Autowired
    private final IDateParser dataParser;


    public BaseballCoach(IDateParser dataParser) {
        System.out.println("Instantiating " + this.getClass().getName());
        this.dataParser = dataParser;
    }


    @PostConstruct
    public void initialize() {
        System.out.println("Initializing bean");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice on " + this.dataParser.parse("20-12-2023");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying bean");
    }
}
