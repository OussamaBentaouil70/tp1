package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Person person =  new Person("Joey", "Doe", LocalDate.parse("2013-01-12"));
      System.out.println(person.getDisplayName() + ": " + person.getAge() + "years" );
// Doe, Joey: 4 years
    }

}