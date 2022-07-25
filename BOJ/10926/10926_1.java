/**
* 메모리: 14324 KB, 시간: 128 ms
* 2022.07.25
* by Alub
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        bw.write(str + "??!");
        
        bw.close();
        br.close();
    }
}
