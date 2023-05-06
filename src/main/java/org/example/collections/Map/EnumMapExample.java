package org.example.collections.Map;

import java.util.EnumMap;

public class EnumMapExample {
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<>(Days.class);
        map.put(Days.MONDAY, "week started..");
        map.put(Days.TUESDAY, "2nd day in a weel");
        map.put(Days.SUNDAY, "holiday..");

        System.out.println(map);

        System.out.println(map.get(Days.SATURDAY));;
    }



}
