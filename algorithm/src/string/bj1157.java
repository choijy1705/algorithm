package string;
import java.io.*;

 
public class bj1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        
        int len = s.length();
 
        // �� ���� ������ arr �迭�� ����
        for(int i=0; i<len; i++) {
            int idx = Character.toLowerCase(s.charAt(i)) - 'a';
            arr[idx]++;
        }
 
        int max = -1;
        char answer = '?';
 
        for(int i=0; i<26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer = (char) (i+65);
            } else if(arr[i] == max)
                answer = '?';
        }
 
        System.out.println(answer);
    }
}