import java.util.Arrays;
import java.util.Comparator;

public class Programmers_Max_number_re {
    public static void main(String[] args){
        int[] numbers = {3,30,34,5,9};
        System.out.println(solution(numbers));

    }
    public static String solution(int[] numbers) {
        String answer = "";
        String[] numbers2 = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            numbers2[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numbers2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //System.out.println((o2+o1));
                //System.out.println((o1+o2));
                return (o2+o1).compareTo(o1+o2);

                /*
                o2+o1 > o1+o2 이면 1로 반환
                o2+o1 == o1+o2이면 0 반환
                o2+o1 < o1+o2 이면 -1 반환
                 */
            }
        });

        // 예외 - 가장 큰 수가 0일 경우 0으로 예외 처리
        if(numbers2[0].equals("0"))
            return answer = "0";

        for(int i=0; i<numbers2.length; i++){
            answer += numbers2[i];
        }

        return answer;
    }
}

/*
Object의 값을 String으로 변환하는 두 메소드의 차이점
String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다.
 */
