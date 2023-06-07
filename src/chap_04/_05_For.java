package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For

        // 반복문 사용 For
        // for문의 형식 : for (선언; 조건; 증감) {}
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("아기짐승 홈런");
        }

        // 짝수만 출력 (fori만 입력하고 enter키)
        for (int i = 0; i < 10; i += 2) {
            System.out.println("< 1부터 10까지의 짝수 출력 >");
            System.out.println(i); // 출력 → 0, 2, 4, 6, 8
        }

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.println("< 1부터 10까지의 홀수 출력 >");
            System.out.println(i); // 출력 → 1, 3, 5, 7, 9
        }

        // 거꾸로 숫자 출력하기
        for (int i = 5; i > 0; i--) {
            System.out.println("< 5부터 1까지 거꾸로 숫자 출력 >");
            System.out.println(i); // 출력 → 5, 4, 3, 2, 1
        }

        // 1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("< 1부터 10까지의 합 출력 >");
        System.out.println(sum); // 출력 → 55

    }
}
