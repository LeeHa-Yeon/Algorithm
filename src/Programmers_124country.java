public class Programmers_124country {

    public static void main(String arg[]) {
        String answer;

        for(int i=1; i<=10; i++) {
            answer=solution(i);
            System.out.println(answer);
        }
    }
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n>0){
            if(n%3==0) {  // 4가 나와야됨
                sb.append(4);
                sb.append(sb);
                n=n/3;
                n-=1;
            }else{
                sb.append(n%3);
                sb.append(sb);
                n=n/3;
            }
        }
        return sb.toString();
    }
}
