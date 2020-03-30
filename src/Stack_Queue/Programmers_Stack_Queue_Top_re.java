package Stack_Queue;

import java.util.Stack;

public class Programmers_Stack_Queue_Top_re {
    public static void main(String[] args){
        //int[] arr = {6,9,5,7,4};
        //int[] arr = {3,9,9,3,5,7,2};
        int[] arr = {1,5,3,6,7,6,5};
        int[] result = solution(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] solution(int[] heights) {
        //int[] answer = new int[heights.length];
        int[] answer = new int[heights.length];
        Stack st = new Stack();
        int pop1;
        // int peek1;

        for(int i=0; i<heights.length; i++){
            st.push(heights[i]);
        }
        while(!st.empty()){
            pop1 = (int)st.pop();  //4
           //  peek1 = (int)st.peek();  // 7
            for(int i=st.size()-1; i>=0; i--) {
              //  System.out.println(i+" : "+st.peek());
                if(heights[i] > pop1){
                    answer[st.size()] = i+1;
                    break;
                }

            }
                /*
                top = (int) st.pop();  //4 7 5
                result = (int)st.peek();  //7 5 9
                if(result > top){
                    answer[i] = st.search(result);
                }
                else if(result < top){
                    st.pop();

                }
                //System.out.println(i+" : "+top);
                }

                 */
            }

        return answer;
    }
}
