package lk.dinuka.service;

import java.util.List;

/**
 * Created by dinuka on 7/24/17.
 */
public class Meal {
    private MealType mealType;
    private List<String> meals;

    public Meal(MealType mealType, List<String> meals) {
        this.mealType = mealType;
        this.meals = meals;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public List<String> getMeals() {
        return meals;
    }

    public void setMeals(List<String> meals) {
        this.meals = meals;
    }

    public enum  MealType {
        LUNCH,
        DINNER,
        BREAKFAST
    }

}
