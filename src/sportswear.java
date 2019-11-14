import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class  sportswear{
    public static void main(String arg[]){
        int n;
        int result;
        int [] lost;
        int [] reserve;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 입력하기
        try {
            n = Integer.parseInt(bf.readLine());  // 전체 학생수 입력 ex ) 5

        } catch (IOException e) {
            e.printStackTrace();
        }


    }//main

    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            int cnt = n;
            boolean[] student = new boolean[n+1];  // 학생을 n명 배열에 넣기

            for(int i=1; i<=n; i++) student[i]= true;

            for(int i=1; i<=n; i++){
                if(n!=0 && lost[i]==1)
                    cnt--;
            }


            return answer;
        }
    }

}