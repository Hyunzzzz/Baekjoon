package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        for(int i = 0; i < n; i++){
            String[] temp = sc.readLine().split(" ");
            int c = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            int sum = 1;
            for(int j = 0; j < b; j++){
                sum = sum * c % 10;
            }
            if(sum == 0){
                sum=10;
                System.out.println(sum);
            }else{
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
