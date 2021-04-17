package com.example.movies.model;

import com.example.movies.MainActivity;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Map;

public class Genre {
    public static Map<Integer, String> genreMap = new HashMap<Integer, String>();

    //hard coded cause i dont want to make another json request
    public static void initializeMap() {
        if (genreMap.get(28) == null) {


            genreMap.put(28, "Action");
            genreMap.put(12, "Adventure");
            genreMap.put(16, "Animation");
            genreMap.put(35, "Comedy");
            genreMap.put(80, "Crime");
            genreMap.put(99, "Documentary");
            genreMap.put(18, "Drama");
            genreMap.put(10751, "Family");
            genreMap.put(14, "Fantasy");
            genreMap.put(36, "History");
            genreMap.put(27, "Horror");
            genreMap.put(10402, "Music");
            genreMap.put(9648, "Mystery");
            genreMap.put(10748, "Romance");
            genreMap.put(878, "Science Fiction");
            genreMap.put(10770, "TV Movie");
            genreMap.put(53, "Thriller");
            genreMap.put(10752, "War");
            genreMap.put(37, "Western");
        }
    }
}
