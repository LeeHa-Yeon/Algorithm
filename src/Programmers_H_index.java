import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Programmers_H_index {
    public static void main(String[] args){
        int[] citations = {3,0,6,1,5};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        Integer[] citations1 = new Integer[citations.length];
        for(int i=0; i<citations.length; i++){
            citations1[i]=citations[i];
        }
        Arrays.sort(citations1, Collections.reverseOrder());
/*        Arrays.sort(citations1, new Comparable<Integer>() {
            @Override
            public int compareTo(Integer o) {
                Integer j=0;
                if(j>o)
                    return j;
                j++;
            }
        });

 */
        return 0;
    }
}
/*
H-index 이해
: 내림차순으로 정렬하고 인덱스 0~4까지 증가시키면서 배열의 값을 비교
6 0
5 1
3 2
1 3   ->  얘가 작으므로 반환
0 4
 */