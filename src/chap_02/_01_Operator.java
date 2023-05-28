package chap_02;

public class _01_Operator {
    public static void main(String[] args) {

        // 산술 연산자

        // 일반 연산자
        System.out.println(6 + 5); // 출력 → 11
        System.out.println(6 - 5); // 출력 → 1
        System.out.println(6 * 5); // 출력 → 30
        System.out.println(6 / 5); // 출력 → 1
        System.out.println(7 / 4); // 출력 → 1
        System.out.println(3 / 3); // 출력 → 1
        System.out.println(6 % 5); // 출력 → 1
        System.out.println(7 % 4); // 출력 → 4

        // 우선 순위 연산
        System.out.println(6 + 5 * 7); // 출력 → 41
        System.out.println((6 + 5) * 7); // 출력 → 77

        // 변수를 이용한 연산
        int num_o = 6;
        int num_t = 5;
        int plus;       // 덧셈
        int minus;      // 뺄셈
        int multiply;   // 곱셈
        int division;   // 나눗셈 (몫)
        int remainder;  // 나눗셈 (나머지)

        plus = num_o + num_t;
        System.out.println(plus); // 출력 → 11

        minus = num_o - num_t;
        System.out.println(minus); // 출력 → 1

        multiply = num_o * num_t;
        System.out.println(multiply); // 출력 → 30

        division = num_o / num_t;
        System.out.println(division); // 출력 → 1

        remainder = num_o % num_t;
        System.out.println(remainder); // 출력 → 1

        // 증감 연산 ++, --
        int val;
        val = 65;
        System.out.println(val); // 출력 → 65

        // ++val : → val값에 먼저 1을 더한후 수행
        val = 65;
        System.out.println(val); // 출력 → 65
        System.out.println(++val);  // 출력 → 66
        System.out.println(val); // 출력 → 66

        // val++ : → val = val + 1;의 의미와 같음
        val = 65;
        System.out.println(val); // 출력 → 65
        System.out.println(val++); // 출력 → 65
        System.out.println(val); // 출력 → 66

        // --val
        val = 65;
        System.out.println(val); // 출력 → 65
        System.out.println(--val); // 출력 → 64
        System.out.println(val); // 출력 → 64

        // val--
        val = 65;
        System.out.println(val); // 출력 → 65
        System.out.println(val--); // 출력 → 65
        System.out.println(val); // 출력 → 64


    }
}
