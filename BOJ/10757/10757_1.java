/**
* 메모리: 19532 KB, 시간: 248 ms
* 2022.07.31
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int maxLength = Math.max(a.length(), b.length());
        
        int[] n = new int[maxLength + 1];
        for(int i = a.length() - 1, idx = 0; i >= 0 ; i--, idx++) {
            n[idx] = a.charAt(i) - '0';
        }
        
        int[] m = new int[maxLength + 1];
        for(int i = b.length() - 1, idx = 0; i >= 0 ; i--, idx++) {
            m[idx] = b.charAt(i) - '0';
        }
        
        for(int i = 0; i < maxLength; i++) {
            int sum = n[i] + m[i];
            n[i] = sum % 10;
            n[i + 1] = n[i + 1] + sum / 10;
        }
        
        StringBuilder sb = new StringBuilder();
        if(n[maxLength] != 0) {
            sb.append(n[maxLength]);
        }
        for(int i = maxLength - 1; i >= 0; i--) {
            sb.append(n[i]);
        }
        
        System.out.println(sb);
        
        scanner.close();
    }
}