package com.springboot.demo.mycoolapp.infra;

import com.springboot.demo.mycoolapp.domain.Coach;
import com.springboot.demo.util.IDateParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class TennisCoach implements Coach {


    public TennisCoach() {
        System.out.println("Instantiating " + this.getClass().getName()); //Not loaded because Lazy
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
