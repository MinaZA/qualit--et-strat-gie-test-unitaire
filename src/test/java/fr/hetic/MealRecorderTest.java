package fr.hetic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MealRecorderTest {

    @Before
    public void setUp() {
        MealRecorder.getMealRecords().clear(); // Assure que la liste est vide avant chaque test
    }

    @Test
    public void testRecordMeal() {
        MealRecorder.recordMeal("Breakfast");
        assertEquals(1, MealRecorder.getMealRecords().size());
        assertEquals("Breakfast", MealRecorder.getMealRecords().get(0));
    }

    @Test
    public void testMultipleMeals() {
        MealRecorder.recordMeal("Lunch");
        MealRecorder.recordMeal("Dinner");
        assertEquals(2, MealRecorder.getMealRecords().size());
        assertEquals("Lunch", MealRecorder.getMealRecords().get(0));
        assertEquals("Dinner", MealRecorder.getMealRecords().get(1));
    }
}
