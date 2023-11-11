package basic_of_java;

import java.util.Scanner;

public class area_of_rhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the length of D1:");
        double D1 =sc.nextDouble();
        System.out.println("Entre the length of D2");
        double D2 = sc.nextDouble();
        double area = (D1*D2)/2;
        System.out.println("Area of Rhombus:"+area);
        sc.close();
    }
}
