package com.springboot.demo.mycoolapp.services;

import com.springboot.demo.mycoolapp.domain.Coach;
import com.springboot.demo.util.IDateParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // create a new instance for each new injection
public class TrackCoach implements Coach {

    @Autowired
    private final IDateParser dataParser;

    public TrackCoach(IDateParser dataParser) {
        System.out.println("Instantiating " + this.getClass().getName()); //Not loaded because Lazy
        this.dataParser = dataParser;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K on " + this.dataParser.parse("20-12-2023");
    }
}
