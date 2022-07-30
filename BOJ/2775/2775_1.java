/**
* 메모리: 17640 KB, 시간: 216 ms
* 2022.07.30
* by Alub
*/
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int[][] apartment = new int[15][15];
        for(int i = 0; i < 15; i++) {
            apartment[0][i] = i;
            apartment[i][1] = 1;
        }
        
        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                apartment[i][j] = apartment[i][j-1] + apartment[i-1][j];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int k = scanner.nextInt(); // 층
            int n = scanner.nextInt(); // 호
            sb.append(apartment[k][n]).append("\n");    
        }
        System.out.println(sb);
        scanner.close();
    }
}