package lk.dinuka.service;

import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dinuka on 7/24/17.
 */
@Service("exampleService")
public class ExampleServiceImpl extends SpringI  ExampleService{

    public Meal getMealsByShop(int id) {
        if (id == 1){
            List<String> meals = new ArrayList<String>();
            meals.add("Those");
            return new Meal(Meal.MealType.BREAKFAST, meals);
        } else {
            return new Meal(Meal.MealType.DINNER, Collections.<String>emptyList());
        }
    }


}
