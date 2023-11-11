package basic_of_java;
import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two numbers is :"+sum);
        sc.close();
    }
}
