import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_1152 {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);

        String str = "";
        System.out.print("문자열을 입력하시오 : ");
        str = scan.nextLine();

        StringTokenizer st = new StringTokenizer(str);

        System.out.print("단어의 개수는 : ");

        System.out.println(st.countTokens());



    }
}
