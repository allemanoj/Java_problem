package basic_of_java;

import java.util.Scanner;

public class isoscelestriangle {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the length of Triangle:");
        double lenght = sc.nextDouble();
        System.out.println("entre the breadth of Triangle:");
        double breadth = sc.nextDouble();
        double area = (breadth*lenght )/2;
        System.out.println("Area of Triangle:"+area);
    
        sc.close();
    }

}
