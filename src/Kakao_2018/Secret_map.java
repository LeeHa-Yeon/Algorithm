package Kakao_2018;

/*
<비밀지도>
1.지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백(" ) 또는벽(#") 두 종류로 이루어져 있다.
2.전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 지도 1과 지도 2라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
3.지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
4.암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

매개변수	값
n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]

매개변수	값
n	6
arr1	[46, 33, 33 ,22, 31, 50]
arr2	[27 ,56, 19, 14, 14, 10]
출력	["######", "### #", "## ##", " #### ", " #####", "### # "]

 */

public class Secret_map {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result;

        result = solution(n, arr1, arr2);

        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int result;

        // 10진수를 2진수로 변환 arr1이랑 arr2의 행끼리
        // arr1과 arr2 합쳤을때 1 이상인 것은 #으로 표기
        // answer[i]에 대입

        for(int cnt=0; cnt<n; cnt++){
            result = arr1[cnt]|arr2[cnt];
            StringBuilder new_str = new StringBuilder(Integer.toBinaryString(result));


            for(int i=0; i<new_str.length(); i++){
                if(new_str.charAt(i)=='0'){
                    new_str.setCharAt(i,' ');
                }else{
                    new_str.setCharAt(i,'#');
                }
            }

            for (; new_str.length() < n; ) { //길이를 n까지 맞춰서 늘려준 후
                new_str.insert(0, " ");
            }
            answer[cnt] = new_str.toString();

        }
        return answer;
    }
}