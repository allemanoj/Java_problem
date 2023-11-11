package basic_of_java;

import java.util.Scanner;

public class factorsOfNum {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Entre the Num Value:");
       int num = sc.nextInt();
       sc.close();
       for(int i=1;i<=num;i++) {
        if(num%i==0) {
            System.out.print(i+" ");
        }
       }
       
        }
    }

