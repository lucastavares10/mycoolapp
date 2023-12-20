package com.springboot.demo.mycoolapp.controllers;

import com.springboot.demo.mycoolapp.domain.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutController {

    //@Autowired - field injection, not recommended anymore
    private Coach myCoach;

    //constructor injection
    @Autowired
    public WorkoutController(@Qualifier("aquatic") Coach coach) {
        this.myCoach = coach;
    }

    //setter injection - recommended to be used in optional logic dependencies
    /*
    @Autowired
    public void setMyCoach(Coach coach) {
        this.myCoach = coach;
    }*/


    @GetMapping("/workout")
    public String handle() {
        return myCoach.getDailyWorkout();
    }


}
