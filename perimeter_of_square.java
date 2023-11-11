package basic_of_java;

import java.util.Scanner;

public class perimeter_of_square {
    public static void main(String[] args){
        System.out.println("Entre the side of Square:");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = 4*side;
        System.out.println("Perimetre of Squre:"+perimeter);
        sc.close();

    }
}
