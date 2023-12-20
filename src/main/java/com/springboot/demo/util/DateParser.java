package com.springboot.demo.util;

import org.springframework.stereotype.Component;

@Component
public class DateParser implements IDateParser {

    public String parse(String date) {
        return date.replace("-", "/");
    }

}
