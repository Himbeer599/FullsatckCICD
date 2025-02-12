package com.streammmm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentProcessor {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Path.of("students.csv"));
        List<Student> students = lines
                .skip(1)
                .map(Student::fromCsv)
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());
        students.forEach(System.out::println);
    }
}
