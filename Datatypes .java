package myPack;

public class datatypes {
    void Demo() {
        System.out.println("Its Data Types Demo");
        int intValue = 10;
        short shortValue = 200;
        long longValue = 1000000L;
        float floatValue = 12.34f;
        double doubleValue = 12.343;
        char charValue = 'A';
        boolean booleanValue = true;
        System.out.println("int : " + intValue);
        System.out.println("short : " + shortValue);
        System.out.println("long : " + longValue);
        System.out.println("float : " + floatValue);
        System.out.println("double : " + doubleValue);
        System.out.println("char : " + charValue);
        System.out.println("boolean : " + booleanValue);
    }

    public static void main(String[] args) {
        datatypes dt = new datatypes();
        dt.Demo();
    }
}
