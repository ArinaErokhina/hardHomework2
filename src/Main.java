public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 6

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println(result);

        // Задание 7

        int y = 5;
        int x = 7;
        y = y + x;
        x = x - y;
        x = -x;
        y = y - x;
        System.out.println(y + " " + x);

        // Задание 8

        int f = 153;
        f = f % 100;
        f = f / 10;
        System.out.println(f);
    }
}