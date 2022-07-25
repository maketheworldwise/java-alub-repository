/**
* 메모리: 17732 KB, 시간: 208 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                sb.append("*");                
            }
            sb.append("\n");
        }
        System.out.println(sb);
        scanner.close();
    }
}