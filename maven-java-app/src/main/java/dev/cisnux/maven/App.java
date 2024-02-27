package dev.cisnux.maven;


import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        final var person = new Person("fajra risqulla", "fajrarisqulla@gmail.com");
        System.out.println(person);
        final var stringJson = new Gson().toJson(person);
        System.out.println(stringJson);
    }
}
