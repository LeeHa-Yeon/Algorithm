import java.util.Scanner;

public class ex_10871 {
    public static void main(String args[]) {

        int N_cnt; //정수 N개로 이루어진 수열
        int X;  // 정수 X

        // 입력하기

        Scanner scan = new Scanner(System.in);  // 문자 입력을 인자로 Scanner 생성

        System.out.print("1 이상의 수열의 갯수와 10000 이하의 정수 X를 차례대로 입력하세요 : ");
        N_cnt = scan.nextInt();
        X = scan.nextInt();

        if(!(1<=N_cnt)) {
            System.out.println("1이상의 수열의 갯수를 입력해주세요");
            N_cnt = scan.nextInt();
        }
        if(!(X<=10000)) {
            System.out.println("10000이하의 정수 X를 입력해주세요");
            X = scan.nextInt();
        }

        int[] A = new int[N_cnt];  // 수열  A
        int cnt1=0;

        do {
            System.out.println("정수 h를"+N_cnt+"개 입력해주세요 (단 h>=1, h<=10000)");

            for (int i=0; i<A.length; i++) {
                A[i] = scan.nextInt();
                if(!(A[i]>=1 && A[i]<=10000)) {
                    System.out.println("범위와 맞지 않습니다. 다시 한번 입력해주세요");
                    A[i] = scan.nextInt();
                }
                if(A[i]<X) {
                    cnt1++;
                    System.out.print(A[i]+" ");
                }
            }
            if(cnt1 == 0) {
                System.out.println(X+"보다 작은 수는 적어도 하나 존재해야합니다.");
            }
        }while(cnt1==0);

    }
}
