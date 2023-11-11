package basic_of_java;

import java.util.Scanner;

public class fibanacci01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the N value:");
        int N = sc.nextInt();
        for( int i=0;i<N;i++)
        {
        System.out.print(fibanacci(i)+" ");
        sc.close();
        }

    }
    public static  int fibanacci(int N){
        if (N<=1) {
            return N;
        }
        else {
            return fibanacci(N-1) + fibanacci(N-2);
        }
      
    }
}
