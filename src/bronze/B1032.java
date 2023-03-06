package bronze;

import java.io.IOException;
import java.util.Scanner;

public class B1032 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        a = sc.nextInt();
        String[] arr = new String[a];
        for(int i =0; i<a;i++) {
            arr[i] = sc.next();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            boolean found = true;
            for(int j=1; j<a; j++) {
                if(c != arr[j].charAt(i)) {
                    found = false;
                }
            }
            if(found) {
                sb.append(c);
            }else{
                sb.append("?");
            }
        }
        System.out.print(sb);

    }
}