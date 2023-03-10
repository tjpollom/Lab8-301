package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList mockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
    @Test
    public void testAddCity() {
        list = mockCityList();
        list.addCity(new City("Edmonton", "AB"));
        int listSize = list.getCount();
        assertEquals(1, listSize);
    }

    @Test
    public void testDeleteCity() {
        list = mockCityList();
        City testCity = new City("Edmonton", "AB");
        list.addCity(testCity);
        int listSize = list.getCount();
        assertEquals(1, listSize);
        list.deleteCity(testCity);
        listSize = list.getCount();
        assertEquals(0, listSize);
    }

    @Test
    public void testHasCity() {
        list = mockCityList();
        City testCity = new City("Edmonton", "AB");
        boolean hasCityBool = list.hasCity(testCity);
        assertFalse(hasCityBool);
        list.addCity(testCity);
        hasCityBool = list.hasCity(testCity);
        assertTrue(hasCityBool);
    }
}
