package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private String fullName;
    private int age;
    private Address address;

    public Person(Address address) {
        this.address = address;

    }
}