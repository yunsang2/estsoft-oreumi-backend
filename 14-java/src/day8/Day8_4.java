package day8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Day8_4 {
    public static void main(String[] args) {
        final int LENGTH = 6;
        final int MAX = 45;
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();

        while (set.size() != LENGTH) {
            set.add(rand.nextInt(MAX) + 1);
        }

        System.out.println("set = " + set);
    }
}
