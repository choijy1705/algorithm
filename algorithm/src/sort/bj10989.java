package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class bj10989 {
 
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())] ++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        for (int i = 1; i < 10000; i++) {
           while(0<arr[i]--) {
        	   bw.write(Integer.toString(i)+"\n");
           }
        }
        br.close();
        bw.close();
    }
 
}
 
 