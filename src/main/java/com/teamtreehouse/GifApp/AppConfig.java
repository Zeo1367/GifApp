package com.teamtreehouse.GifApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Zeo Dragoneel on 08-05-2017.
 */

//Enables our application to get auto configured
@EnableAutoConfiguration
//Scans our application for controllers because spring doesn't do this on its own
@ComponentScan
//Main class of the app. Thus it'll contain the main function
public class AppConfig {

    public static void main(String[] args) {
        //run function( a method from Spring Boot Library) that starts the app by taking in the main class
        //in byte code with an args followed which act in the same way as it does in the main function
        SpringApplication.run(AppConfig.class,args);
    }
}
