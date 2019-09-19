import java.util.Scanner;

public class ex_2439 {
    public static void main(String args[]) {

        int N;

        Scanner scan = new Scanner(System.in);  // 문자 입력을 인자로 Scanner 생성

        System.out.print("N의 개수(1≤N≤100)를 입력 : ");
        N = scan.nextInt();

        for(int i=0; i<N; i++) {
            for(int j=0; j<(N-i-1); j++) System.out.print(" ");
            for(int k=0; k<=i; k++) System.out.print("*");
            System.out.println("");
        }

    }
}
