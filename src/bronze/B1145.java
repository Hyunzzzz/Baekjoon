package bronze;

import java.util.Scanner;

public class B1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for(int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }
        int b = 1;
        while(true){
            int count = 0;
            for(int i=0; i<5; i++){
                if(b % a[i] == 0){
                    count++;
                }
            }
            if(count >= 3){
                System.out.println(b);
                break;
            }
            b++;
        }
    }

}
