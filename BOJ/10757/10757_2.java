/**
* 메모리: 21460 KB, 시간: 404 ms
* 2022.07.31
* by Alub
*/
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        
        a = a.add(b);
        
        System.out.println(a.toString());
        
        scanner.close();
    }
}