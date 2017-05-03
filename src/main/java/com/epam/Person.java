package com.epam;

/**
 * Created by Ivan on 5/3/2017.
 */
public class Person extends gitoverview{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("xx");
    }

    @Override
    public String toString() {
        return "NEW_IVAN";

    }
}
