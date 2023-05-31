package chap_02;

public class _05_Operator_5 {
    public static void main(String[] args) {

        // 삼항 연산자
        // 결과 = (조건)? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 65;
        int y = 2;
        int max = (x > y)? x : y;
        System.out.println(max); // 출력 → 65

        int min = (x < y)? x : y;
        System.out.println(min); // 출력 → 2

        boolean b = (x == y)? true : false;
        System.out.println(b); // 출력 → false

        String s = (x != y)? "다름" : "같음";
        System.out.println(s); // 출력 → 다름

    }
}
