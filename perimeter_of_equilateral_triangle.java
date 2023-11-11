package basic_of_java;

import java.util.Scanner;

public class perimeter_of_equilateral_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the length of side of Triangle:");
        double side = sc.nextDouble();
        double perimeter = 3*side;
        System.out.println("The perimeter of Equilateral Triangle:"+perimeter);
        sc.close();
    }
}
