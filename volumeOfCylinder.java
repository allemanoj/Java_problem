package basic_of_java;

import java.util.Scanner;
// this program is not excuting ,,,,,,why bro !!!!
/*Because bro you forgotten to put String[] args in the main function ,so it leads to non excutable 
 * code..
 */
public class volumeOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the radius of Cylinder:");
        double radius = sc.nextDouble();
        System.out.println("entre the height of the cylinder:");
        double height = sc.nextDouble();
        double volume = (Math.PI*radius*radius*height);
        System.out.println("The volume of the Cylinder:"+volume);
        sc.close();
    }
}
