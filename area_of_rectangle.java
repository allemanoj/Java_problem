package basic_of_java;

import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the Length Of Triagle:");
        double length = sc.nextDouble();
        System.out.println("Entre the Breadth");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("Area of the circle is:"+area);
        sc.close();
    }
}
