import java.util.Scanner;

public class ex_46410 {
    public static void main(String args[]) {

        int N;

        Scanner scan = new Scanner(System.in);  // 문자 입력을 인자로 Scanner 생성

        System.out.print("N의 개수(1≤N≤100)를 입력 : ");
        N = scan.nextInt();

        for(int i=0; i<N; i++) {
            for(int j=(N-i); j>0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
