package chap_06;

// 전달값, Parameter

public class _02_Parameter {

    // 전달값이 있는 메소드
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + " 의 제곱은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 제곱은 " + result);
    }

    public static void main(String[] args) {

        // 2 → 2 * 2 = 4
        // 3 → 3 * 3 = 9
        // Argument, 인수
        power(7); // 출력 → 7 의 제곱은 49
        powerByExp(6, 5); // 출력 → 6의 5 제곱은 7776

    }
}
