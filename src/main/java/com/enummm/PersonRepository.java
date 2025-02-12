package com.enummm;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private final Map<Integer, Person> personMap = new HashMap<>();

    public void addPerson(Person person){
        personMap.put(person.id(), person);
    }

    public Optional<Person> findById(int id){
        return Optional.ofNullable(personMap.get(id));
    }
    public void printPerson(Person person){
        Optional<Person> personToFind = findById(person.id());
        System.out.println(personToFind.get().favoriteDay());
        System.out.println(personToFind.get().name());
        System.out.println(personToFind.get().id());
    }
//    public Person findById(int id){
//        for(Person person : personMap.values()){
//            Optional<Person> personToFind = Optional.ofNullable(personMap.get(id));
//            if(personToFind.isEmpty()){
//                System.out.println("The person can not be found");
//                return null;
//            }
//            return person;
//        }
//        return new Person(1,"nike",DaysOfWeek.FRIDAY);
//    }
}
