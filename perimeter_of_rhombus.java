package basic_of_java;
import java.util.Scanner;

public class perimeter_of_rhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the diagonals of Rhombus:");
        System.out.println("Entre the first diagonal");
        double p = sc.nextDouble();
        System.out.println("Entre the second diaginal:");
        double q = sc.nextDouble();
        double perimeter = 4*Math.sqrt((p*p + q*q)/2);
        System.out.println("Perimeter of Rhombus is:"+perimeter);
        sc.close();
        


    }
}
