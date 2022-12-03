package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;


public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.setFavouriteFood("Bone");
        System.out.println(fido.getFavouriteFood());

        fido.setAge(4);
        System.out.println(fido.getAge());
    }

    @Test
    public void creating_dog_using_constructor() {
        Dog dodo = new Dog("Dodo", "Milk", 3);
        System.out.println(dodo.getName());
        System.out.println(dodo.getFavouriteFood());
        System.out.println(dodo.getAge());
        Assert.assertEquals("Dodo", dodo.getName());
        Assert.assertEquals("Milk", dodo.getFavouriteFood());
        Assert.assertEquals(3, dodo.getAge());
    }

    @Test
    public void dog_makes_noise(){
        Dog my_dog = new Dog();
        System.out.println(my_dog.makeNoise());
        my_dog.feed();

    }
}
