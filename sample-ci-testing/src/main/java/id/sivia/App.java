package id.sivia;

public class App {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers is: " + sum);
    }

    public void longParameterList(String a, String b, String c, String d, String e) {
        System.out.println("Long parameter list: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }
}
