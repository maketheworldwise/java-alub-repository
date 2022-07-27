/**
* 메모리: 17504 KB, 시간: 204 ms
* 2022.07.28
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.next();
        StringBuilder fsb = new StringBuilder(f);
        int fn = Integer.parseInt(fsb.reverse().toString());
        
        String s = scanner.next();
        StringBuilder ssb = new StringBuilder(s);
        int sn = Integer.parseInt(ssb.reverse().toString());
        
        if(fn < sn) {
            System.out.println(sn);
        } else {
            System.out.println(fn);
        }
        scanner.close();
    }
}