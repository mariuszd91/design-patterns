package pl.sdacademy.designpatterns.creational.singleton;

import sun.jvm.hotspot.memory.Universe;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate d;
        Universe universe = Universe.INSTANCE;
        UniverseV2 universeV2 = UniverseV2.getInstance();
        Universe3 universe3 = Universe3.getInstance();
        UniverseV4 universeV4 = UniverseV4.getInstance();

        System.out.println(universe3 == Universe3.getInstance());
    }
}
