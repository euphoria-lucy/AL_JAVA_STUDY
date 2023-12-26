package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // int, double, float, char 같은 기본자료형을 객체 형태로 만들어 사용할 수 있도록 해주는 역할

        Integer i = 205; // int i = 205;
        Double d = 14.0; // double d = 14.0;
        Character c = 'J'; // char c = 'J';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("-------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("-------");

        String s = i.toString();
        System.out.println(s);
    }
}
