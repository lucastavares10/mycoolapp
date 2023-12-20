package com.springboot.demo.mycoolapp.services;

import com.springboot.demo.mycoolapp.domain.Coach;
import com.springboot.demo.mycoolapp.infra.TennisCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternalCoach {

    @Bean("aquatic")
    public Coach tennisCoach() {
        return new TennisCoach();
    }


}
