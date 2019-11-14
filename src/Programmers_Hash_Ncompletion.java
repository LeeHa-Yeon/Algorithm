import java.util.Arrays;

public class Programmers_Hash_Ncompletion {
    public static void main(String[] args) {
        //String[] participant = {"leo","kiki","eden"};
        //String[] completion = {"eden","kiki"};
        //  String[] participant = {"marina","josipa","nikola","vinko","filipa"};
        //        String[] completion = {"josipa","filipa","marina","nikola"};
        String[] participant = {"mislav","stanko","mislav","ana"};
        String[] completion = {"stanko","ana","mislav"};
        String answer;

        answer=solution(participant,completion);

        System.out.println(answer);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer="";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i< participant.length; i++) {
            if (participant[i].equals(participant[i + 1]) && !completion[i].equals(completion[i + 1])) {
                answer = participant[i];
                break;
            }
            for (int j = 0; j < completion.length; j++) {
                if (!participant[i].equals(completion[j])) {
                    answer = participant[i];
                }
            }
        }

        return answer;
    }
}