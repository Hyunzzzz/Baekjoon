package bronze;

import java.util.Scanner;

public class B1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sb.append(a).reverse();
        StringBuilder sb1 = new StringBuilder();
        sb1.append(b).reverse();
        int c = Integer.parseInt(sb.toString()) + Integer.parseInt(sb1.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c).reverse();
        System.out.println(Integer.parseInt(sb2.toString()));
    }
}
