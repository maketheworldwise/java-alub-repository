/**
* 메모리: 17696 KB, 시간: 224 ms
* 2022.07.26
* by Alub
*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            int n = scanner.nextInt() % 42;
            map.put(n, 0);
        }
        System.out.println(map.keySet().size());
        scanner.close();
    }
}