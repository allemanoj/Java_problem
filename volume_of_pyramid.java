package basic_of_java;

import java.util.Scanner;

public class volume_of_pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Base Length:");
        double l = sc.nextDouble();
        System.out.println("Entre the Base Width:");
        double w = sc.nextDouble();
        System.out.println("Entre the Height:");
        double h = sc.nextDouble();
        double volume = ((l*w*h)/3);
        System.out.println("Volume of Pyramid:"+volume);
        sc.close();
    }
}
