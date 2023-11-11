package basic_of_java;

import java.util.Scanner;

public class volume_of_sphere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double volume = ((4.0/3.0)*Math.PI*Math.pow(radius,3));
        System.out.println("Volume of the Sphere:"+volume);
        sc.close();
    }
}
