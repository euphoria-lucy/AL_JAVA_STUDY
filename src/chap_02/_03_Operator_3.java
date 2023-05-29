package chap_02;

public class _03_Operator_3 {
    public static void main(String[] args) {

        // 비교 연산자 - 참이면 true, 거짓이면 false 출력
        System.out.println(65 > 37); // 출력 → true, 65는 37보다 크다
        System.out.println(65 >= 37); // 출력 → true, 65는 37보다 크거나 같다
        System.out.println(65 >= 65); // 출력 → true, 65는 65보다 크거나 같다
        System.out.println(65 >= 93); // 출력 → false, 6는 93보다 크거나 같다

        System.out.println(65 < 37); // 출력 → false, 65는 37보다 작다
        System.out.println(65 <= 37); // 출력 → false, 65는 37보다 작거나 같다

        System.out.println(65 == 65); // 출력 → true, 65는 65와 같다
        System.out.println(65 == 37); // 출력 → false, 65는 37과 같다
        System.out.println(65 != 65); // 출력 → false, 65는 65와 같지 않다
        System.out.println(65 != 37); // 출력 → true, 65는 37과 같지 않다

    }
}
