package Kakao_2018;

import java.util.StringTokenizer;

public class Dart_game {
    public static void main(String[] args){
        String dartResult = "1D2S#10S";
        int result=solution(dartResult);
        System.out.println(result);

    }

    public static int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        char[] test = new char[dartResult.length()];
        int[] result = new int[3];
        StringBuilder sb=new StringBuilder("");

        for(int i=0; i<dartResult.length(); i++){
            test[i] = dartResult.charAt(i);
        }

        for(int i=0; i<test.length; i++){
            if(test[i] >=48 && test[i] <=57){
                sb.append(test[i]);
            }else if(test[i]=='S'){
                result[index++] = Integer.parseInt(sb.toString());
                sb.delete(0,sb.length());
            }else if(test[i]=='D'){
                result[index++] = (int)Math.pow(Integer.parseInt(sb.toString()),2);
                sb.delete(0,sb.length());
            }else if(test[i]=='T'){
                result[index++] = (int)Math.pow(Integer.parseInt(sb.toString()),3);
                sb.delete(0,sb.length());
            }else if(test[i]=='#'){
                result[index-1] = result[index-1] * (-1);
            }else if(test[i]=='*'){
                if(index==1){
                    result[index-1] = result[index-1]*2;
                }else{
                    result[index-1] = result[index-1]*2;
                    result[index-2] = result[index-2]*2;
                }
            }
        } // for

        for(int i=0; i<result.length; i++){
            answer += result[i];
        }

        return answer;
    }
}


/*
<숭인이 코드>
public static void main(String[] args) {
        String dartResult = "1S2D*3T";

        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<dartResult.length();i++){
            if(dartResult.charAt(i) >=48 && dartResult.charAt(i)<=57){ //숫자라면, 아스키코드값 48 - 57 -> 0 ~ 9
                sb.append(dartResult.charAt(i));
            }else if(dartResult.charAt(i) == 'S'){
                list.add(Integer.parseInt(sb.toString()));
                sb.delete(0,sb.length());//sb 초기화
            }else if(dartResult.charAt(i) == 'D'){
                list.add( Integer.parseInt(sb.toString()) * Integer.parseInt(sb.toString()) );
                sb.delete(0,sb.length());//sb 초기화
            }else if(dartResult.charAt(i) == 'T'){
                list.add( Integer.parseInt(sb.toString()) * Integer.parseInt(sb.toString()) * Integer.parseInt(sb.toString()) );
                sb.delete(0,sb.length());//sb 초기화
            }else if(dartResult.charAt(i) == '*'){
                if(list.size() > 1){
                    list.set(list.size()-1,list.get(list.size()-1) * 2);//index  ,element
                    list.set(list.size()-2,list.get(list.size()-2) * 2);//index  ,element
                }else{
                    list.set(list.size()-1,list.get(list.size()-1) * 2);//index  ,element
                }

            }else if(dartResult.charAt(i) == '#'){
                list.set(list.size()-1,-list.get(list.size()-1));
            }
        }//for

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            answer+=list.get(i);
        }
        return answer;
    }

 */