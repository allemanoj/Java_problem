package basic_of_java;
import java.util.Scanner;


public class volume_of_prism_for_all_bases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of base(Triangle,Rectangle,Square,pentagon,Hexagonal,Octagonal,Trapezoid)");
        String baseType = sc.nextLine();

        double baseArea = 0.0;
        // according to user chose we calcualte the base area,using the switch case.
        // chossing the switch case is the most intresting part of this code

        switch(baseType.toLowerCase()){
            case "triangle":
              baseArea = calculateTriangleArea();
              break;
            case "rectangle":
              baseArea = calculateRectangleArea();
              break;
            case "square":
              baseArea = calculateSquareArea();
              break;
            case "pentagon":
              baseArea = calculatePentagonArea();
              break;
            case "hexagonal":
              baseArea = calculateHexagonalArea();
              break;
            case "octagonal":
              baseArea = calculateOctagonalArea();
              break;
            case "trapezoid":
              baseArea = calculateTrapexoidArea();
              break;
            default:
              System.out.println("Invalid base type");
              break;              
        }
        if(baseArea != 0.0){
            System.out.println("Entre the height of the prism: ");

            double height = sc.nextDouble();
            
            

            double volume = baseArea * height;

            System.out.println("The volume of the" + baseType + "prism is :"+volume);
        }
        sc.close();
    }
// to know about clear understanding of methods read methods in javatpoint.com/method-in-java website
// your exactly at the accers and mutators-- and you have to complete the this code which reference is availbile at th charGdp.
// I leaving this to create learning gap. to remember for long time.
// here I created a new method for each quadrilateral to calcualting the base area only.
    private static double calculateTriangleArea(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the base length of the Triangle: ");
      double base = sc.nextDouble();
      System.out.println("Entre the height of the triangle:");
      double height = sc.nextDouble();
      sc.close();

      return 0.5*base*height;

    }
    private static double calculateRectangleArea(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the length of Rectangle: ");
      double length = sc.nextDouble();
      System.out.println("Entre the breadth/width");
      double breadth = sc.nextDouble();
      sc.close();
      return length * breadth;
      

    }
    private static double calculateSquareArea(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the length of Side of Squae:");
      double side = sc.nextDouble();
      sc.close();
      return side*side;
    }
    private static double calculatePentagonArea(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the length of Apothem:");
      double apothem = sc.nextDouble();
      System.out.println("Entre the base Edge:");
      double base = sc.nextDouble();
      sc.close();
      return ((5*apothem*base)/2);
    }
    private static double calculateHexagonalArea(){   
       Scanner sc = new Scanner(System.in);  
      System.out.println("Entre the length of apothem:");
      double apothem = sc.nextDouble();
      System.out.println("Entre the Base:");
      double base = sc.nextDouble();
      sc.close();
      return 3*apothem*base;
    }
    private static double calculateOctagonalArea(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the base edge:");
      double base = sc.nextDouble();
      sc.close();
      return  (2*(1+Math.sqrt(2)))*base*base;
    }
    private static double calculateTrapexoidArea(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the long base edge:");
      double a = sc.nextDouble();
      System.out.println("Entre the Short base edge:");
      double b = sc.nextDouble();
      System.out.println("Entre the length of Trapexoid:");
      double length = sc.nextDouble();
      sc.close();
      return (((a+b)*length)/2);
    

    
  

}
}
