package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println(localTime);

        LocalDateTime newTime = localTime.plusWeeks(2);
        System.out.println(newTime);

        LocalDate futureDate = LocalDate.of(2025,5,1);
        if(localTime.toLocalDate().isBefore(futureDate)){
            System.out.println("Current date is before " + futureDate);
        }else{
            System.out.println("Current date is after " + futureDate);
        }

        LocalDate date1 = LocalDate.of(2025,2,17);
        LocalDate date2 = LocalDate.of(2023,1,17);
        long daysBetween = ChronoUnit.DAYS.between(date2,date1);
        System.out.println(daysBetween);

    }
}
