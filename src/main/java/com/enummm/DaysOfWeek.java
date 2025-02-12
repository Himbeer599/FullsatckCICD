package com.enummm;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;

public enum DaysOfWeek {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static String getDayType(DaysOfWeek day) {
        return (day == SATURDAY || day == SUNDAY) ?"Weekend":day.name();
    }
}

