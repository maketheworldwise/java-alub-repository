/**
* 메모리: 18412 KB, 시간: 236 ms
* 2022.07.25
* by Alub
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentTime = scanner.nextLine();
        String ovenTime = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(currentTime);
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(ovenTime);

        int cookingTotalMinutes = h * 60 + m + l;

        int lh = cookingTotalMinutes/60;
        int lm = cookingTotalMinutes%60;
        if(lh >= 24) {
            lh = lh - 24;
        }
        System.out.println(lh + " " + lm);

        scanner.close();
    }
}