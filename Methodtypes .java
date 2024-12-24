package myPack;

import java.util.Scanner;

public class methodType {
    // instance variables
    int no1, no2, ans; 
    Scanner sc = new Scanner(System.in);

    // Method without parameters, without return type
    void add() {
        System.out.println("Enter value for no1 : ");
        no1 = sc.nextInt();
        System.out.println("Enter value for no2 : ");
        no2 = sc.nextInt();
        ans = no1 + no2;
        System.out.println("Addition : " + ans);
        System.out.println("----------------------------");
    }

    // Method without parameters, with return type
    int sub() {
        System.out.println("Enter value for no1 : ");
        no1 = sc.nextInt();
        System.out.println("Enter value for no2 : ");
        no2 = sc.nextInt();
        ans = no1 - no2;
        return ans;
    }

    public static void main(String[] args) {
        methodType mt = new methodType();
        mt.add();
        int result = mt.sub();
        System.out.println("Subtraction : " + result);
    }
}
