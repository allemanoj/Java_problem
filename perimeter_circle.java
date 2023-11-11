package basic_of_java;
import java.util.Scanner;

public class perimeter_circle {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the Radius of Circle:"); 
        double radius = sc.nextDouble();
        double circumference = 2*Math.PI*radius;
        System.out.println("The circumference of the circle is:"+circumference);
        sc.close();
        

      }

}
