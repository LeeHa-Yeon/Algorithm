import java.util.ArrayList;

public class Programmers_Stack_Queue_Ironbar {
    public static void main(String[] args){
        String arrangement = "()(((()())(())()))(())";
        int result;

        result = solution(arrangement);
        System.out.println(result);
    }
    public static int solution(String arrangement) {
        arrangement = arrangement.replace("()", "*");
        int answer = 0;
        ArrayList<Character> push = new ArrayList<Character>();

        for(int i=0; i<arrangement.length(); i++){
            push.add(arrangement.charAt(i));
        }
        ArrayList<Character> stack = new ArrayList<Character>();

        for(int i=0; i<push.size(); i++){
            if(push.get(i)=='('){
                stack.add(push.get(i));
            }else if(push.get(i)==')'){
                stack.remove(stack.size()-1);
                answer+=1;
            }else if(push.get(i)=='*'){
                answer+=stack.size();
            }
        }
        return answer;
    }
}
