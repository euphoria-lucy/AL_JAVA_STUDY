package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {

        // 이중 반복문

        System.out.println("--- 하트 (♥)로 5행 5열 사각형 만들기 ---");

        // 하트 (♥) 사각형 만들기
        /* 출력 ▼
        ♥ ♥ ♥ ♥ ♥
        ♥ ♥ ♥ ♥ ♥
        ♥ ♥ ♥ ♥ ♥
        ♥ ♥ ♥ ♥ ♥
        ♥ ♥ ♥ ♥ ♥
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("♥ ");
            }
            System.out.println(); // 5개 출력 후 줄바꿈
        }

        System.out.println();
        System.out.println("--- 클로버 (♣) 왼쪽 정렬 삼각형 만들기 ---");

        // 클로버 (♣) 왼쪽 삼각형 만들기
        /* 출력 ▼
        ♣
        ♣ ♣
        ♣ ♣ ♣
        ♣ ♣ ♣ ♣
        ♣ ♣ ♣ ♣ ♣
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("♣ ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("--- 보라색 하트 (💜) 오른쪽 정렬 삼각형 만들기 ---");

        // 보라색 하트 (💜) 오른쪽 정렬 삼각형 만들기
        /* 출력 ▼
                    💜
                 💜 💜
              💜 💜 💜
           💜 💜 💜 💜
        💜 💜 💜 💜 💜
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("💜");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--- 별 (★) 가운데 정렬 삼각형 만들기 --- ");

        // 별 (★) 가운데 정렬 삼각형 만들기
        /* 출력 ▼
               ★
              ★ ★
             ★ ★ ★
            ★ ★ ★ ★
           ★ ★ ★ ★ ★
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ★");
            }
            System.out.println();
        }

    }
}
