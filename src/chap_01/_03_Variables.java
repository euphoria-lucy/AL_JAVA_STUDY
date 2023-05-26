package chap_01;

// 변수 (float, long)

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김정민"; // 문자형변수
        int hour = 7; // 정수형변수

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다");

        double score = 65.37; // 실수형변수
        char grade = 'J'; // 문자형변수

        System.out.println(name + "님의 점수는 " + score + "점입니다");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;

        System.out.println("합격여부 : " + pass);
        
        double d = 65.37;
        float f = 65.37F; // float는 숫자뒤에 F를 붙여주어야 함

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // long은 숫자 뒤에 L을 붙어주어야함

        System.out.println(l);
    }
}
