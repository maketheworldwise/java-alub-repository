/**
* 메모리: 17688 KB, 시간: 216 ms
* 2022.08.03
* by Alub
*/
import java.util.Scanner;

public class Main {
	public static int recursion(int n) {
		if(n == 0) return 1;
		return n * recursion(n-1);
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(recursion(n));
        scanner.close();
    }
}