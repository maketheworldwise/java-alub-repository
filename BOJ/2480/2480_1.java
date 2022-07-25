/**
* 메모리: 17736 KB, 시간: 208 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int reward = 0;
        if(a == b && b == c) reward = 10000 + a * 1000;
        else if(a == b && b != c) reward = 1000 + a * 100;
        else if(a != b && b == c) reward = 1000 + b * 100;
        else if(a == c && b != c) reward = 1000 + c * 100;
        else {
            reward = Math.max(Math.max(a, b), c) * 100;
        }
        
        System.out.println(reward);
    }
}