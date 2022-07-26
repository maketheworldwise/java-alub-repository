/**
* 메모리: 19884 KB, 시간: 212 ms
* 2022.07.26
* by Alub
*/
public class Main {
    public int d(int n) {
        // n의 자릿수 덧셈
        int pos = 0;
        String nStr = String.valueOf(n);
        for(int i = 0; i < nStr.length(); i++) {
            pos += Integer.parseInt(String.valueOf(nStr.charAt(i)));
        }
        return n + pos;
    }

    public static void main(String[] args) {
        Main main = new Main();
        boolean[] arr = new boolean[50000];

        for(int i = 0; i <= 10000; i++) {
            arr[main.d(i)] = true;
        }
        for(int j = 0; j <= 10000; j++) {
            if(!arr[j]) {
                System.out.println(j);
            }
        }
    }
}