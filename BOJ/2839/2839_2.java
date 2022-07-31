/**
* 메모리: 14336 KB, 시간: 140 ms
* 2022.07.31
* by Alub
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int result = 0;
        if(n == 4 || n == 7) {
            result = -1;
        } else if(n % 5 == 0) {
            result = n / 5;
        } else if(n % 5 == 1 || n % 5 == 3) {
            result = n / 5 + 1;
        } else if(n % 5 == 2 || n % 5 == 4) {
            result = n / 5 + 2;
        }
        
        bw.write(result + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}
