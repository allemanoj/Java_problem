package basic_of_java;
import java.util.Scanner;

public class curved_surface_area_of_cylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Radius of cylinder:");
        float radius = sc.nextFloat();
        System.out.println("Entre the Height of cylinder:");
        float height = sc.nextFloat();
        double  CSA = (2.0*Math.PI*radius*height);
        System.out.println("Curved Surface area of cylinder is"+CSA);
        sc.close();
    }
}
