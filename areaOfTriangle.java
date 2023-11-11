package basic_of_java;
import java.util.Scanner;



public class areaOfTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre the  length of Triangle ");
        double  length = sc.nextDouble();
        System.out.println("Entre the Height of Triangle:");
        double height = sc.nextDouble();
        double area =0.5*(length*height);
        System.out.println("Area of Triangle is:"+area);
        sc.close();
    }
}