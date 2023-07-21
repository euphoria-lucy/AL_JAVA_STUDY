package chap_06;

// 메소드가 필요한 이유
// 비슷하거나 같은 동작을 하는데 값만 변한다면 메소드로 실행
// 코드 간소화
// 중복 호출 가능
// 용이한 수정 → 코드 유지보수 용이

public class _06_WhenToUse {

    public static int getPower (int number) {
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        // 2의 2승 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승 구하기
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4의 2승 구하기
        System.out.println(getPower(4, 2)); // 4 * 4 = 16;

    }
}
