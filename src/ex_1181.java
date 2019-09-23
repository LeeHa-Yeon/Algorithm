import java.io.*;

public class ex_1181 {
    public static void main(String arg[]) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언

        try {
            int num;
            int n =Integer.parseInt(bf.readLine());
            char arr[] = new char[100];
            boolean isContinuous = false;
            int cnt =0;

            if( n >0 && n <=100) {
                num = n;

                for(int i=0; i<num; i++){  // 첫번째 단어부터 num번째 단어까지
                    boolean result = true;
                    String word = bf.readLine();  // 단어를 입력

                    for(int j=0; j<word.length(); j++) {  // 단어의 형태소로 쪼개기
                        arr[j] = word.charAt(j);
                    }
                    if(word.length()<=2){
                        cnt++;
                    }
                    else {
                            for (int k = 0; k < word.length()-2; k++) {
                                for (int m = k + 2; m < word.length(); m++) {
                                    if (arr[k] != arr[k + 1]) { // 연속되지 않음
                                        if (arr[k] == arr[m]) {
                                            result = false;
                                            break;
                                        } else {
                                            result = true;
                                        }
                                    }
                                }
                                if (!result) {
                                    break;
                                }
                            }
                        }
                        if(result){
                            cnt = cnt +1;
                        }
                    }
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                bw.write(cnt+"");
                bw.flush();
                bw.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
