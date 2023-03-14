package silver;

import java.util.Scanner;

public class B1331 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean[][] chess = new boolean[6][6];
        boolean[][] chess1 = new boolean[6][6];
        String move;
        int a=0;
        int b=0;
        boolean fat = false;
        while(true){
            move = sc.next();
            int i=a;
            int j=b;
            int count=0;
            a = move.charAt(0)-65;
            b = move.charAt(1)-49;
            if(chess[a][b] == true){
                if(i==0){
                    chess[a][b] = false;
                }else{
                    if(((i-a==2||a-i==2)&&(j-b==1||b-j==1))||((i-a==1||a-i==1)&&(j-b==2||b-j==2))){
                        chess[a][b]=false;
                    }else{
                        fat = true;
                        break;
                    }
                }
                count++;
                if(count==36){
                    break;
                }
            }
            if (chess[a][b]==false){
                System.out.println("dsd");
            }

        }
        if(fat==true){
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
        }
    }


}
