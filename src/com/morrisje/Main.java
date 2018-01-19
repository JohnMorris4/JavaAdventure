package com.morrisje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of the computer learning Java"));
        locations.put(1, new Location(1, "You are beside a brook near the forest"));
        locations.put(2, new Location(2, "You are awaiting for the mail for your Java books"));
        locations.put(3, new Location(3, "You are on top of a hill"));
        locations.put(4, new Location(4, "You are sitting in a chair watching a movie"));
        locations.put(5, new Location(5, "You are beside the mountain"));
        locations.put(6, new Location(6, "You are in the forest"));

        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0){
                break;
            }
            loc = scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("You are trying to move to an invalid location");
            }
        }
    }
}
