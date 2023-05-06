package org.example.collections.Set;

import java.util.EnumSet;

public class EnumSetExample {
    enum GAMES {
        CRICKET, HOCKEY, TENNIS, SHUTTLE
    }
    enum GAMES1 {
        FOTTBALL, VOLLYBALL
    }
    public static void main(String[] args) {
        EnumSet<GAMES> enumSet = EnumSet.allOf(GAMES.class);
        System.out.println(enumSet);

        EnumSet<GAMES1> enumSet1 = EnumSet.noneOf(GAMES1.class);
        enumSet1.add(GAMES1.FOTTBALL);
        enumSet1.add(GAMES1.VOLLYBALL);
        enumSet1.add(GAMES1.FOTTBALL);
        System.out.println(enumSet1);

        EnumSet<GAMES1> enumSet2 = EnumSet.of(GAMES1.FOTTBALL, GAMES1.VOLLYBALL);

        EnumSet<GAMES1> enumSet3 = EnumSet.range(GAMES1.FOTTBALL, GAMES1.VOLLYBALL);
        System.out.println(enumSet3);

        enumSet.stream().filter(e -> e.name().startsWith("C")).forEach(e -> System.out.println(e));

    }
}
