/**
* 메모리: 17696 KB, 시간: 208 ms
* 2022.07.26
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String numStr = String.valueOf(a*b*c);
        int[] result = new int[10];
        for(int i = 0; i < numStr.length(); i++) {
            switch(numStr.charAt(i)) {
                case '0': result[0]++; break;
                case '1': result[1]++; break;
                case '2': result[2]++; break;
                case '3': result[3]++; break;
                case '4': result[4]++; break;
                case '5': result[5]++; break;
                case '6': result[6]++; break;
                case '7': result[7]++; break;
                case '8': result[8]++; break;
                case '9': result[9]++; break;
            }
        }
        for(int j = 0; j < 10; j++) {
            System.out.println(result[j]);
        }
        scanner.close();
    }
}