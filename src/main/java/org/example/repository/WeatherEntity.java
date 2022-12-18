package org.example.repository;

import java.net.URI;

public class WeatherEntity {

    public static void main(String[] args) {
//        Call a random wikipedia article and print the title
//        create a method which calls the api and returns the title
        apiCall();
    }

    private static void apiCall() {
        URI url = URI.create("https://en.wikipedia.org/w/api.php?action=query&format=json&prop=extracts&exintro=&explaintext=&titles=Albert%20Einstein");




    }
}
