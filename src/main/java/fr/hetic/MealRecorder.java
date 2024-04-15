package fr.hetic;

import java.util.ArrayList;
import java.util.List;

public class MealRecorder {
    private static List<String> mealRecords = new ArrayList<>();

    public static void recordMeal(String meal) {
        mealRecords.add(meal);
    }

    public static List<String> getMealRecords() {
        return mealRecords;
    }
}