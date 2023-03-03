package com.infotech.learning.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.infotech.learning.model.Plant;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController
@RequestMapping("/plantfinder-api")
public class PlantFinderMainController {

    Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    List<Plant> plants;


    @GetMapping("/plants")
    public List<Plant> getPlants(){
        logger.info("getting all plants");
        return plants;
    }

    @PostMapping("/add")
    public void addAPlant(@RequestBody Plant plant)
    {
     plant.setId(plants.size()+1);
     logger.info("added a plant");
     plants.add(plant);
    }


}
