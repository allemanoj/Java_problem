package basic_of_java;

import java.util.Scanner;

public class continue_statemet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++) {
            if(i % 3 == 0) {
                 continue;
            }
            System.out.println(i); 
 
        }
        sc.close();
    }
    
}
