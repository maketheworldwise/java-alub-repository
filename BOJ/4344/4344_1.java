/**
* 메모리: 32796 KB, 시간: 464 ms
* 2022.07.26
* by Alub
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] result = new String[t];
        for(int i = 0; i < t; i++) {
            int people = scanner.nextInt();
            int[] score = new int[people];
            int sum = 0;
            for(int j = 0; j < people; j++) {
                score[j] = scanner.nextInt();
                sum += score[j];
            }
            double avg = (double)sum/people;
            int count = 0;
            for(int k = 0; k < people; k++){
                if(score[k] > avg) count++;
            }
            result[i] = String.format("%.3f",((double)count / people * 100));
        }
        for(int p = 0; p < t; p++) {
            System.out.println(result[p] + "%");
        }
        scanner.close();
    }
}