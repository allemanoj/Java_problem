package basic_of_java;
import java.util.Scanner;

public class area_of_Equilateral_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre the side of Equalatral Triangle: ");
        double side = sc.nextDouble();
        double area = (side*side*Math.sqrt(3))/4;
        System.out.println("Area of the Equilateral Triangle is"+area);
        sc.close();

    }
}
