package basic_of_java;

import java.util.Scanner;

public class sum_till_user_entre_0 {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number:");
        int sum =0;
        // int num; 
        /*if you declare the num if not you not intilize the num it shows
         * error bro!!!
         */
        int largest = 0;
        int num =1;
        while( num != 0){
         num = sc.nextInt();

        if(num == 0){
            break;
        }if(num > largest ){
            largest = num;
        }
             sum+=num;

        }
        System.out.println("the largest number in input:"+largest);
        System.out.println("Sum of numbers entred by user is:"+sum);
        sc.close();
/*
 * we can do this in do while loop also;
 * like 
 * do{
 * input = sc.nextInt();
 * sum+= input;
 * }while(input!=0);
 */
    }
    

}
