package com.enummm;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        System.out.println(DaysOfWeek.getDayType(DaysOfWeek.FRIDAY));
        PersonRepository persons = new PersonRepository();
        Person person1 = new Person(1,"Mike",DaysOfWeek.SATURDAY);
        Person person2 = new Person(2,"Jack",DaysOfWeek.MONDAY);
        Person person3 = new Person(3,"Hike",DaysOfWeek.TUESDAY);
        Person person4 = new Person(4,"Randol",DaysOfWeek.FRIDAY);
        persons.addPerson(person1);
        persons.addPerson(person2);
        persons.addPerson(person3);
        persons.addPerson(person4);

        Optional<Person> foundPerson = persons.findById(2);
        System.out.println("Found Person: "+foundPerson);
        persons.printPerson(person1);

    }
}
