package com.infotech.learning.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infotech.learning.model.Plant;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Plant> plants(){

        List plants=new ArrayList<Plant>();

        //Add plants
        Plant plant1=new Plant();
        plant1.setId(1);
        plant1.setName("Pothos");
        plant1.setType("Indoor");
        plants.add(plant1);

        Plant plant2=new Plant();
        plant2.setId(2);
        plant2.setName("Lily");
        plant2.setType("Outdoor");
        plants.add(plant2);

        return plants;

    }



}
