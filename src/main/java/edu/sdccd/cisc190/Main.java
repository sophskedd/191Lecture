package edu.sdccd.cisc190;

public class Main {
    /**
     * Main.main() is the entry point for this app
     * @param args
     */
    public static void main(String[] args) {
        int integerDemo = 1;
        System.out.println(integerDemo);
        integerDemo = integerDemo + 1;
        integerDemo++;

        long longDemo = 99999999L;
        System.out.println(longDemo + 200);
        System.out.println(longDemo - 200);
        System.out.println(longDemo / 5);
        System.out.println(longDemo * 25);

        System.out.println("hello world!");
        System.out.println("whats up");
    }
}
