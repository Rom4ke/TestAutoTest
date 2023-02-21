package main;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerData {

    static Faker faker = new Faker(new Locale("ru"));

    public static String randomFirstName(){
        return faker.name().firstName();
    }

    public static String randomLastName(){
        return faker.name().lastName();
    }

    public static String randomEmail(){
        return faker.bothify("??????@gmail.com");
    }

    public static String randomPhone(){
        return faker.bothify("8921#######");
    }

    public static String randomFullAddress(){
        return faker.address().fullAddress();
    }

}

