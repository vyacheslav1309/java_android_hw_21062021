package hw1;

public class Main {
    public static void main(String[] args) {
//        byte val = -127;
//        short val = 32766;
//        int val = 555777;
//        long val = 15555555L;
//        float val = 25.33;
//        double val = 125.521;
//        char val = '#';
//        boolean val = true;
        System.out.println(calculate(1.1f, 2.1f, 3.1f, 4.1f));
        System.out.println(sum(5, 5));
        negPos(-25);
        negative(35);
        hello("Victor");
        visokos(1904);
    }


      public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean sum(int i, int j) {
        int h = i + j;
        return h >= 10 && h <= 20;
    }

    public static void negPos(int s) {
        if (s >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static void negative(int q) {
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void visokos(int year) {
        if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else if(year % 100 == 0) {
            System.out.println("Год не високосный");

        }else if(year%4 ==0){
            System.out.println("Год  високосный");
        }else{
            System.out.println("Год не високосный");
        }
    }
}