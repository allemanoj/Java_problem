package basic_of_java;

import java.util.Scanner;

public class volume_of_cone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the Volume of Cone!!");
        System.out.println("Entre the radius of cone");
        double radius = sc.nextDouble();
        System.out.println("Entre the height of cone:");
        double height = sc.nextDouble();
        double Volume =( (Math.PI*(radius*radius)*height)/3);
        System.out.println("volume of cone is:"+Volume);
        sc.close();

    }
}
