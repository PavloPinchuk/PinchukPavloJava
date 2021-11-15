package com.univ;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bus> buses = new ArrayList<>();
        buses.add(new Bus("Dominic Toretto", "AA2203CB", "M12", "Bogdan", 1995, 100000));
        buses.add(new Bus("Roman Pierce", "AI8883AI", "E95", "Audi", 2005, 200000));
        buses.add(new Bus("McQueen", "BX1150CA", "M12", "Opel", 2000, 150000));
        buses.add(new Bus("Michael Schumacher", "AA7777AA", "M10", "Mercedes", 1998, 80000));

        for (Bus bus: buses
             ) {
            if(bus.getRouteNumber() == "M12")
                System.out.println(bus.toString());
        }
        System.out.println("/////////////////////////////////////////");
        for (Bus bus: buses
        ) {
            if(2021 - bus.getYear() > 20)
                System.out.println(bus.toString());
        }
        System.out.println("/////////////////////////////////////////");
        for (Bus bus: buses
        ) {
            if(bus.getMileage() > 120000)
                System.out.println(bus.toString());
        }
    }
}
