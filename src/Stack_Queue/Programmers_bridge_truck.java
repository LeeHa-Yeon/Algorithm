package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_bridge_truck {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(solution(bridge_length,weight,truck_weights));

    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> in_Truck = new LinkedList<>();  // 다리를 건너는 트럭
        Queue<Truck> out_Truck = new LinkedList<>(); // 다리를 지나간 트럭

        for(int w : truck_weights){
            out_Truck.add(new Truck(w,bridge_length));
        }

        return answer;
    }
    public static class Truck{
        int weight;
        int distance;

        Truck(int weight, int distance){
            this.weight = weight;
            this.distance = distance;
        }
    }
}
