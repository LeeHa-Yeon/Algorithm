import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_DAY_0102 {
    public static void main(String[] args){
        Student A= new Student("LEEHAYEON",25);
        Student B = new Student("KIMSUYEON",23);
        Student C = new Student("PARKJISOO",26);

        List<Student> sd = new ArrayList<>();
        sd.add(A);
        sd.add(B);
        sd.add(C);

        Collections.sort(sd);
        for(int i=0; i<sd.size(); i++) {
            System.out.println(sd.get(i).name);
        }


    }
    public static class Student implements Comparable<Student>{
        String name;
        int age;

        public Student(String name, int age){
            super();
            this.name = name;
            this.age = age;
        }
        @Override
        public int compareTo(Student o){
            return this.name.compareTo(o.name);
        }

    }
}

