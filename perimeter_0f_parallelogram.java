package basic_of_java;

import java.util.Scanner;

public class perimeter_0f_parallelogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Adjacent sides of parallelogram:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double perimeter = 2*(a+b);
        System.out.println("perimeter of the parallelogram:"+perimeter);
        sc.close();

    }
}
