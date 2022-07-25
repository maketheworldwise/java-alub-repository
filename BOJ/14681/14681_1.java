/**
* 메모리: 14272 KB, 시간: 128 ms
* 2022.07.25
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
        
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        if(x > 0 && y > 0) System.out.println("1");
        else if(x < 0 && y > 0) System.out.println("2");
        else if(x < 0 && y < 0) System.out.println("3");
        else if(x > 0 && y < 0) System.out.println("4");
        
        bw.close();
        br.close();
    }
}
