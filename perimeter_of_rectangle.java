package basic_of_java;
import java.util.Scanner;
public class perimeter_of_rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre he Length:");
        double length = sc.nextDouble();
        System.out.println("Entre the Breadth of Rectangle:");
        double breadth = sc.nextDouble();
        double perimeter = 2*(length + breadth);
        System.out.println("Perimeter of Rectangle is :"+ perimeter);
        sc.close();

    }

}