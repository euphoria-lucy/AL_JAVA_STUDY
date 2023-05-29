package chap_02;

public class _02_Operator_2 {
    public static void main(String[] args) {

        // 대입 연산자

        int num = 65;
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

        // 복합 대입 연산자
        // num = num + 3
        num += 3;
        System.out.println(num); // 출력 → 68

        // num = num - 3
        num -= 3;
        System.out.println(num); // 출력 → 65

        // num = num * 3
        num *= 3;
        System.out.println(num); // 출력 → 195

        // num = num / 3
        num /= 3;
        System.out.println(num); // 출력 → 65

        // num = num % 3
        num %= 3;
        System.out.println(num); // 출력 → 2

    }
}

