package com.airhacks.sports.boundary;

/**
 *
 * @author airhacks.com
 */
public class SportsCatalog {

    public String all(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Category parameter cannot be null");
        }
        return "go, chess";
    }

    public void save(String game) {

    }

}
