import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class k_num {
    public static void main(String arg[]){
        int [] arr = {1,5,2,6,3,7,4};
        int [][] com = {{2,5,3},{4,4,1},{1,7,3}};
        int [] answer = new int[3];

        answer = solution(arr,com);



            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            try {
                bw.write("[");
                for(int i=0; i<3; i++) {
                    bw.write( answer[i]+",");
                }
                bw.write("]");
                bw.flush();
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

    }
        public static int[] solution(int[] array, int[][]commands){
            int [] answer = new int [3];

            for(int i=0; i<answer.length; i++){
                ArrayList <Integer>  list= new ArrayList<Integer>();
                for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                    list.add(array[j]);
                }
                list.sort(null);
                answer[i] = list.get(commands[i][2]-1);


            }
            return answer;
        }
}