package day6;

public class Day6_3 {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();

        myLamp.turnOn().printStatus();
        myLamp.turnOff().printStatus();
    }
}
