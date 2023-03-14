package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(sc.readLine());

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(sc.readLine()," ");

        while (a-- >0){
            int n = Integer.parseInt(st.nextToken());
            max = n>max?n:max;
            min = n<min?n:min;
        }
        System.out.println(max*min);

    }
}

