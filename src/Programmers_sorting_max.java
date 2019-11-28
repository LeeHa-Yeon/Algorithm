import java.util.ArrayList;


public class Programmers_sorting_max {

    public static int result=0;

    public static void main(String[] args){
        int[] numbers = {3,30,34,5,9};

        int n = 5;
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        perm(numbers, output, visited, 0, n, 5);

        System.out.println(result);
    }

    public static String solution(int[] numbers) {
        String answer = "";

        return answer;
    }


    // 순서를 지키면서 n 개중에서 r 개를 뽑는 경우
    // 사용 예시: perm(arr, output, visited, 0, n, 3);
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if(depth == r) {
            print(output, r);
            return;
        }

        for(int i=0; i<n; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;;
            }
        }
    }

        // 배열 출력
        static void print(int[] arr, int r) {
            ArrayList<Integer> arr_1=new ArrayList<Integer>();
            //String[] arr_2 = new String[arr.length];
            String str="";

            for(int i=0; i<r; i++)
                arr_1.add(arr[i]);

            for(int i=0;i<arr_1.size();i++) {
                str += Integer.toString(arr_1.get(i));
            }

            if(result<Integer.parseInt(str)){
                result = Integer.parseInt(str);
            }
        }
}
