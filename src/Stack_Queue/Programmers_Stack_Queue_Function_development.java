package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Programmers_Stack_Queue_Function_development {
    public static void main(String[] args){
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        int[] result = solution(progresses, speeds);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue q= new LinkedList();
        int index = 0;
        int count = 0;  // 하루에 배포되는 개수

        while(index < progresses.length) {  // progresses 기능 개수 만큼 돌리기

            for (int i = 0; i < speeds.length; i++) {  // 기능에 speeds % 작업을 하기
                progresses[i] += speeds[i];   // 94 60 60
            }

            if(progresses[index]>=100) {
                while(progresses[index]>=100) {
                    if(index<progresses.length-1) {
                        index++;
                        count++;
                    }
                }
            }

            q.offer(count);
            count =0;

        }
        answer = new int[q.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = (int) q.poll();
        }
        return answer;
    }
}

/*
int[] answer = {};
        Queue q= new LinkedList();
        Queue q1 = new LinkedList();
        int count =0;
        int index = 0;

        for(int i=0; i<progresses.length; i++){
            q.offer(progresses[i]);
        }

        while(!q.isEmpty()){
            int development = (int)q.poll();  // 93
            while(development<100){
                development += speeds[index];
                count++;
            }
            System.out.println(count);
            q1.offer(count);
            index++;
            count =0;
        }

        for(int i=0; i<q1.size(); i++){
            System.out.println(q1.poll());
        }


        return answer;
 */