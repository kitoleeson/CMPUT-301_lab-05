package com.example.lab5_starter;

import java.io.Serializable;

/**
 * This is a class that defines a City.
 **/
public class City implements Serializable, Comparable<City> {

    /** The name of the city */
    private String city;
    /** The name of the province */
    private String province;

    /**
     * Constructs a new city with the given city and province name
     * @param city
     *  Name of the city
     * @param province
     *  Name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the province
     * @return
     *  The name of the province
     */
    public String getProvinceName() {
        return province;
    }

    /**
     * Sets the name of the province
     * @param province
     *  The new province name
     */
    public void setProvinceName(String province) {
        this.province = province;
    }

    /**
     * Returns the name of the city
     * @return
     *  The name of the city
     */
    public String getCityName() {
        return city;
    }

    /**
     * Sets the name of the city
     * @param city
     *  The new city name
     */
    public void setCityName(String city) {
        this.city = city;
    }

    /**
     * Compares this City to another City based on their names
     * @param city
     *  The city to compare against
     * @return
     *  A negative, zero, or positive integer based on if this City name is less than, equal to, or greater than the specified city's name
     */
    @Override
    public int compareTo(City city){
        return this.city.compareTo(city.getCityName());
    }
}
