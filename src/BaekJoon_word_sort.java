import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BaekJoon_word_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 입력할 단어의 개수

        HashSet<String> set = new HashSet<String>();

        for(int i=0; i<n; i++){
            set.add(br.readLine());  // 차례대로 set에 넣기
        }
        List list = new ArrayList(set);
        Collections.sort(list);

        // 특수한 경우를 비교하기 위해서 Comparator를 사용
        Collections.sort(list,new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length())
                    return 1;
                else if(o1.length()==o2.length())
                    return o1.compareTo(o2);
                else
                    return -1;
            }
        });

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}


/*
문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
입력
첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

*/

/*
<HashSet 사용 - 중복 제거를 위해>
HashSet은 Set의 파생클래스로 Set은 기본적으로 집합으로 중복된 원소를 허용하지 않습니다. 순서도 고려 안합니다.
HashSet set1 = new HashSet();  // 선언
set1.add(Object obj);  // 모든 타입을 추가
Iterator it1 = set1.iterator();  // HashSet타입을 iterator으로 저장
it1.hasNext(); // 다음 데이터가 있다면 true으로 반환
it1.next();  // 다음 데이터를 반환

HashSet에 순서를 있게 할 수 있는 메소드 => Collections.sort
List list1 = new ArrayList(set1);
Collections.sort(list1);


 */