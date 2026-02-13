package com.example.lab5_starter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a calss that keeps track of a list of City objects
 */
public class CityList {
    private final List<City> cities = new ArrayList<City>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *  This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) throw new IllegalArgumentException();
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks to see if a city is in the list
     * @param city
     *  The city to check
     * @return
     *  Returns a boolean, true if city is already in the list, false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This removes a city from the list
     * Throws an exception if city is not in the list
     * @param city
     *  The city to remove
     */
    public void deleteCity(City city){
        if (!this.hasCity(city)) throw new IllegalArgumentException();
        cities.remove(city);
    }

}
