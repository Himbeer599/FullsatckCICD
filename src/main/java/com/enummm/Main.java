package com.enummm;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        System.out.println(DaysOfWeek.getDayType(DaysOfWeek.FRIDAY));
        PersonRepository persons = new PersonRepository();
        Person person1 = new Person(1,"Mike",DaysOfWeek.SATURDAY,Gender.Male);
        Person person2 = new Person(2,"Jack",DaysOfWeek.MONDAY,Gender.Male);
        Person person3 = new Person(3,"Hike",DaysOfWeek.TUESDAY,Gender.Male);
        Person person4 = new Person(4,"Randol",DaysOfWeek.FRIDAY,Gender.Diverse);
        persons.addPerson(person1);
        persons.addPerson(person2);
        persons.addPerson(person3);
        persons.addPerson(person4);

        Optional<Person> foundPerson = persons.findById(2);
        System.out.println("Found Person: "+foundPerson);
        foundPerson.ifPresentOrElse(
                person -> System.out.println(person.name()+"'s favorite day is " + DaysOfWeek.getDayType(person.favoriteDay())),
                ()-> System.out.println("Person not found")
        );
        Map<Gender,Long> maleNumber = persons.countByGender();
        System.out.println("Male number: "+maleNumber);

        Optional<Person> personByname = persons.findByName("Jack");
        System.out.println(personByname);
        List<Person> personByFD = persons.findPersonByFD(DaysOfWeek.MONDAY);
        System.out.println(personByFD);
        persons.printAllPersons();

//        persons.printPerson(person1);

    }
}
