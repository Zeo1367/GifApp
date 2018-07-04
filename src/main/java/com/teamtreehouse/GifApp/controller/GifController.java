package com.teamtreehouse.GifApp.controller;

import com.teamtreehouse.GifApp.data.GifRepository;
import com.teamtreehouse.GifApp.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Zeo Dragoneel on 08-05-2017.
 */
//Tells spring to identify this class as a controller while it does a component scan using @ComponentScan
@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    //Tells the Dispatcher Servelet to look for the following method whenever the following request will be made
    @RequestMapping("/")
    /*@ResponseBody :- This @ could've been used if the we don't want our data to be further processed and be
    treated as a response to the request been made.
    ForEg: Below we returned "home" name of the html file where we want our data to go and to be processed by
    Thymeleaf there.*/
    //The method consists ModelMap(a POJO:Plain Old Java Object) as a parameter, this mM will store the data
    //of our model object and make it available to the view(the html file whose name will be there in the return)
    //there is no need of returning mM as Spring will do this for us.
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs",allGifs);
        //return the name of the html file so that SpringViewResolver will tell the ThymeleafViewResolver to go
        //and do the further processing there.
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif= gifRepository.findByName(name);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
