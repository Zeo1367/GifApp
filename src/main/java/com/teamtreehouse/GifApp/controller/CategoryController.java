package com.teamtreehouse.GifApp.controller;

import com.teamtreehouse.GifApp.data.CategoryRepository;
import com.teamtreehouse.GifApp.data.GifRepository;
import com.teamtreehouse.GifApp.model.Category;
import com.teamtreehouse.GifApp.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Zeo Dragoneel on 09-05-2017.
 */
@Controller
public class CategoryController {

        @Autowired
        private CategoryRepository categoryRepository;

        @Autowired
        private GifRepository gifRepository;
        @RequestMapping("/categories")
        public String listCategories(ModelMap modelMap){
            List<Category> categories = categoryRepository.getAllCategories();
            modelMap.put("categories",categories);
            return "categories";
        }

        @RequestMapping("/category/{id}")
        public String category(@PathVariable int id,ModelMap modelMap){
            Category category = categoryRepository.findById(id);
            modelMap.put("category",category);

            List<Gif> gifs=gifRepository.findByCategoryId(id);
            modelMap.put("gifs",gifs);

            return "category";
        }


    }

