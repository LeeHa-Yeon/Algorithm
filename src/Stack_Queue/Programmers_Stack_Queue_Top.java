package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Programmers_Stack_Queue_Top {

    public static void main(String[] args){
        int[] heights={6,9,5,7,4};
        int[] heights1={3,9,9,3,5,7,2};
        int[] heights2={1,5,3,6,7,6,5};
        int[] answer;
        int[] answer1;
        int[] answer2;


        answer=solution(heights);
        answer1=solution(heights1);
        answer2=solution(heights2);

        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer1));
        System.out.println(Arrays.toString(answer2));
    }

    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for(int i=heights.length-1; i>0; i--){
            for(int j=i-1; j>=0; j--){
                if(heights[i]<heights[j]) {
                    answer[i] = j + 1;
                    break;
                }
                answer[i]=0;
            }
            if(i==0){
                answer[i]=0;
            }
        }
        return answer;
    }
}
