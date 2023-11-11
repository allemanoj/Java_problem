package basic_of_java;
import java.util.Scanner;

public class total_surface_area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the side of cube:");
        double side = sc.nextDouble();
        double total_surface_area = (6*Math.pow(side, 2));
        System.out.println("Total surface area of the cube:"+total_surface_area);
        sc.close();



    }
    
}
