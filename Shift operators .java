package myPack;

import java.util.Scanner;

public class ShiftOperatorsDemo {

    int no1, no2;
    Scanner sc = new Scanner(System.in);

    void testShiftOperator() {
        System.out.println("Enter no1: ");
        no1 = sc.nextInt();
        System.out.println("Enter no2: ");
        no2 = sc.nextInt();

        System.out.println("no1 << no2: " + (no1 << no2));

        System.out.println(no1 + " << " + no2 + " = " + (no1 << no2) + " (This is equivalent to " + no1 + " * 2^" + no2 + ")");

        System.out.println("no1 >> no2: " + (no1 >> no2));

        System.out.println(no1 + " >> " + no2 + " = " + (no1 >> no2) + " (This is equivalent to " + no1 + " / 2^" + no2 + ")");
    }

    public static void main(String[] args) {
        ShiftOperatorsDemo sod = new ShiftOperatorsDemo();
        sod.testShiftOperator();
    }
}
