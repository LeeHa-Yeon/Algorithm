import java.util.Arrays;

public class Programmers_k_num_re {
    public static void main(String[] args){
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] result = new int[commands.length];

        result = solution(array,commands);

        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]);
            if(i!=result.length-1)
                System.out.print(",");
        }
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] result = {};
        for(int i=0; i<commands.length; i++){
            result = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(result);
            answer[i] = result[commands[i][2]-1];
        }

        return answer;
    }
}

/*
이차원 배열
number[2][3]={{3,27,327},{2,26,326}};
3 27 237   ((0,0),(0,1),(0,2))
2 26 326   ((1,0),(1,1),(1,2))
*/