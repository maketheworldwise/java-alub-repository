/**
* 메모리: 17180 KB, 시간: 204 ms
* 2022.07.25
* by Alub
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine().split(" ")[1]);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if(n < x) bw.write(n + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}