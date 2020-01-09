import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Bufferedreader로 사용했을때는 오류가 난다. ask ㅁ
public class Baekjoon_age_sort {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 입력할 단어의 개수

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++){
            arr[i][0] = sc.next();  // 나이
            arr[i][1] = sc.next();  // 이름
        }

        Arrays.sort(arr,new Comparator<String[]>() { // 0:나이 , 1:이름
            @Override
            public int compare(String[] o1,String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
