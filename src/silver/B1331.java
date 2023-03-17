package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1331 {

    static int dx[] = new int[]{1,1,2,2,-1,-1,-2,-2};
    static int dy[] = new int[]{2,-2,1,-1,2,-2,1,-1};
    static int isCan[][] = new int[6][6];
    static boolean flag;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();

        int x = start.charAt(0) - 'A';
        int y = start.charAt(1) - '1';

        isCan[x][y] = 1;

        int tx = x;
        int ty = y;

        for(int i = 0;i<35;i++) {
            String last = br.readLine();

            int lx = last.charAt(0) - 'A';
            int ly = last.charAt(1) - '1';

            flag = false;

            for(int k = 0; k<8;k++) {
                int nx = dx[k] + tx;
                int ny = dy[k] + ty;

                if (nx < 0 || 6 <= nx || ny < 0 || 6 <= ny) continue;

                if (nx == lx && ny == ly && isCan[nx][ny] == 0) {
                    isCan[lx][ly] = 1;
                    flag = true;
                    break;
                }


            }

            if (flag) {
                tx = lx;
                ty = ly;
            } else {
                System.out.println("Invalid");
                return;
            }

        }

        flag = false;
        for(int i = 0; i<8;i++) {

            if ((tx+dx[i]) == x && (ty+dy[i]) == y ) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

