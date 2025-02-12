package com.enummm;

import java.util.*;
import java.util.stream.Collectors;

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

    public Map<Gender,Long> countByGender(){
        return personMap.values().stream()
                .collect(Collectors.groupingBy(Person::gender, Collectors.counting()));
    }
    public Optional<Person> findByName(String name){
        return personMap.values().stream()
                .filter(person -> person.name().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Person> findPersonByFD(DaysOfWeek favoriteDay){
        return personMap.values().stream()
                .filter(person -> person.favoriteDay().equals(favoriteDay))
                .collect(Collectors.toList());
    }
    public void printAllPersons() {
        personMap.values().forEach(System.out::println);
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
