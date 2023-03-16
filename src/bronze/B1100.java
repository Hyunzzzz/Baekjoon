package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i=0 ;i<8; i++){
            String a = sc.readLine();
            for(int j=0; j<8; j++){
                if(a.charAt(j)=='F'&& ((i+j)%2)==0) count++;
            }
        }
        System.out.println(count);
    }
}

