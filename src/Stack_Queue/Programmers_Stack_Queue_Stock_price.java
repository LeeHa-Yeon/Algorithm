package Stack_Queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers_Stack_Queue_Stock_price {
    public static void main(String[] args){
        int[] prices= {1,2,3,2,3};
        int[] result = solution(prices);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int temp;
        int j=0;
        int count =0;
        Queue<Integer> q= new LinkedList<Integer>();

        for(int i=0; i<prices.length; i++){
            q.offer(prices[i]);
        }
        while(!q.isEmpty()){
            count =0;
                temp = (int) q.poll(); //3
                for (int b : q) {
                    count++;
                    if (temp > b)
                        break;
                }
            answer[j++] = count;
        }
        return answer;
    }
}
