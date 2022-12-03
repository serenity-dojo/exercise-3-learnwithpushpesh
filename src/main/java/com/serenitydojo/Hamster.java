package com.serenitydojo;

public class Hamster extends Pet{
    public String getFavouriteGame() {
        return favouriteGame;
    }

    private String favouriteGame;

    public Hamster(String name, int age, String favouriteGame) {
        super(name,age);
        this.favouriteGame = favouriteGame;

    }
}
