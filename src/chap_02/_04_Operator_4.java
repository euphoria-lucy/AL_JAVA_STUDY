package chap_02;

public class _04_Operator_4 {
    public static void main(String[] args) {

        // 논리 연산자
        boolean KJM = true;
        boolean RHG = true;
        boolean PSH = true;

        System.out.println(KJM || RHG || PSH); // 하나라도 true이면 true출력
        System.out.println(KJM && RHG && PSH); // 모두 true이면 true

        // AND(&&) 연산자
        System.out.println((65 > 06) && (06 > 2)); // 65는 06보다 크고, 06은 2보다 크다. 출력 → true
        System.out.println((65 > 06) && (06 < 2)); // 65는 06보다 크고, 06은 2보다 작다. 출력 → false

        // OR(||) 연산자
        System.out.println((65 > 06) || (06 > 2)); // 65는 06보다 크거나, 06은 2보다 크다. 출력 → true
        System.out.println((65 > 06) || (06 < 2)); // 65는 06보다 크거나, 06은 2보다 작다. 출력 → true
        System.out.println((65 < 06) || (06 < 2)); // 65는 06보다 작거나, 06은 2보다 작다. 출력 → false

        // 논리 부정 연산자
        System.out.println(!true); // 출력 → false
        System.out.println(!false); // 출력 → true
        System.out.println(!(65 == 65)); // 출력 → false
        System.out.println(!(65 == 06)); // 출력 → true

    }
}
