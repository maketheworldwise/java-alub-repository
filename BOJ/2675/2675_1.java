/**
* 메모리: 17508 KB, 시간: 228 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();
            
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        scanner.close();
    }
}