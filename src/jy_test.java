public class jy_test {
    public static void main(String[] args) {
        // 비교 연산하여 프린트 했을 때 true가 나오도록
        String s1 = "asdf";
        String s2 = new String("asdf");

        System.out.println(s1.intern());
        System.out.println(s2.intern());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        if(s1.equals(s2))
            System.out.println("ture");
        else
            System.out.println("false");
        if(s1==s2)
            System.out.println("ture");
        else
            System.out.println("false");

        if(s1 == s2.intern())
            System.out.println("ture");
        else
            System.out.println("false");

        if(s1.hashCode() == s2.hashCode())
            System.out.println("ture");
        else
            System.out.println("false");
    }
}
