import java.util.Collections;
import java.util.PriorityQueue;

public class EXAM {
    public static void main(String[] args){
        int[] priorities = {2,1,3,2};
        //int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 2;

        System.out.println(solution(priorities,location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i : priorities){
            pq.offer(i);   // 1 1 9 1 1 1
        }

        for(int j =0; j<priorities.length; j++){
            if(pq.peek() == priorities[j]) {
                if (j == location) {
                    return answer + 1;
                }
                answer++;
                pq.poll();
            }
            //ctrl+shift+/

        }

        return answer+1;
    }
}
