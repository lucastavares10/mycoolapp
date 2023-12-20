package com.springboot.demo.mycoolapp.services;

import com.springboot.demo.mycoolapp.domain.Coach;
import com.springboot.demo.util.IDateParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // is only loaded as needed in application
public class CricketCoach implements Coach {

    @Autowired
    private final IDateParser dataParser;

    public CricketCoach(IDateParser dataParser) {
        System.out.println("Instantiating " + this.getClass().getName()); //Not loaded because Lazy
        this.dataParser = dataParser;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes on " + this.dataParser.parse("20-12-2023");
    }
}
