package basic_of_java;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the radius of circle");
        double radius = sc.nextFloat();
        sc.close();
        double area = (Math.PI*radius*radius);
        System.out.println("Area of Circle is :"+area);



    }
}
