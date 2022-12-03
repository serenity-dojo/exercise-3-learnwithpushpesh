package com.serenitydojo;

public class Dog {

    private String name;
    private String favouriteFood;
    private int age;

    public Dog(String name, String favouriteFood, int age) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    public Dog() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
