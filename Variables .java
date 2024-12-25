package myPack;

public class variables {
    int num = 120;
    void put() { 
        int no = 10; 
        System.out.println("no : " + no);
        System.out.println("num : " + num);
    }

    void write() { 
        int no = 100; 
        System.out.println("no : " + no);
        System.out.println("num : " + num);
    }

    public static void main(String[] args) {
        variables obj = new variables();
        obj.put();
        obj.write();
    }
}
