/**
* 메모리: 17588 KB, 시간: 204 ms
* 2022.07.27
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(arr[ch-'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int value : arr) {
            sb.append(value).append(" ");
        }
        System.out.println(sb);
        scanner.close();
    }
}