package com.enummm;


public enum DaysOfWeek {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static String getDayType(DaysOfWeek day) {
        return (day == SATURDAY || day == SUNDAY) ?"Weekend":day.name();
    }
}

