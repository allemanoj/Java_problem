package basic_of_java;

import java.util.Scanner;

public class fibanacci02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
        //  int b = 1;
        //   int a = 0;

        //  int c;
      //  for(int i = 0; i<N ; i++) { 
            // c = a + b ;
            // a = b;
            // b = c;
            // System.out.println(a);
            System.out.println(fibanacci(N) + " ");
            sc.close();
   // }
}
 public static int fibanacci (int N){
    if(N<=1)
      return N;
    else
      return fibanacci(N-1) + fibanacci(N-2);  
}
}
