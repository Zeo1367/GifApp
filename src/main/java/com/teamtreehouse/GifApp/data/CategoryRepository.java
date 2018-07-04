package com.teamtreehouse.GifApp.data;

import com.teamtreehouse.GifApp.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Zeo Dragoneel on 09-05-2017.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Aadee"),
            new Category(2, "XYZ"),
            new Category(3, "Taylor")
    );

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id)
                return category;
        }
        return null;
    }
}