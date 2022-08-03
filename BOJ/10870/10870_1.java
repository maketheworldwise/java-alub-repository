/**
* 메모리: 17604 KB, 시간: 216 ms
* 2022.08.03
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static int recursion(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return recursion(n-1) + recursion(n-2);
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();    
        System.out.println(recursion(n));
        scanner.close();
    }
}