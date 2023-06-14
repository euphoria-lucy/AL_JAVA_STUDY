package chap_05;

public class _01_Array {
    public static void main(String[] args) {

        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "딸기 요거트 스무디";
        String coffeeRachel = "자몽 허니 블랙티";
        String coffeeChandler = "초콜릿 크림 칩 프라푸치노";
        String coffeeMonica = "망고 용과 레모네이드 스타벅스 리프레셔";

        System.out.println(coffeeRoss + " 1개"); // 출력 → 딸기 요거트 스무디 1개
        System.out.println(coffeeRachel + " 1개"); // 출력 → 자몽 허니 블랙티 1개
        System.out.println(coffeeChandler + " 1개"); // 출력 → 초콜릿 크림 칩 프라푸치노 1개
        System.out.println(coffeeMonica + " 1개"); // 출력 → 망고 용과 레모네이드 스타벅스 리프레셔 1개
        System.out.println("주세요");

        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        // 배열 선언 첫번째 방법
        // String[] coffees = new String[4];

        // 배열 선언 두번째 방법
        // String coffees[] = new String[4];

        // ★ 배열의 인덱스는 0부터 시작함!!
        /* coffees[0] = "딸기 요거트 스무디";
        coffees[1] = "자몽 허니 블랙티";
        coffees[2] = "초콜릿 크림 칩 프라푸치노";
        coffees[3] = "망고 용과 레모네이스 스타벅스 리프레셔"; */

        // 배열 선언 세번째 방법
        // String[] coffees = new String[] { "딸기 요거트 스무디", "자몽 허니 블랙티", "초콜릿 크림 칩 프라푸치노", "망고 용과 레모네이스 스타벅스 리프레셔" };

        // 배열 선언 네번째 방법
        String[] coffees = { "딸기 요거트 스무디", "자몽 허니 블랙티", "초콜릿 크림 칩 프라푸치노", "망고 용과 레모네이스 스타벅스 리프레셔" };

        // 커피 주문
        System.out.println(coffees[0] + " 1개"); // 출력 → 딸기 요거트 스무디 1개
        System.out.println(coffees[1] + " 1개"); // 출력 → 자몽 허니 블랙티 1개
        coffees[2] = "아이스 시그니처 초콜릿"; // 값 변경
        System.out.println(coffees[2] + " 1개"); // 출력 → 초콜릿 크림 칩 프라푸치노 1개 ▶ 아이스 시그니처 초콜릿 1개로 변경
        System.out.println(coffees[3] + " 1개"); // 출력 → 망고 용과 레모네이드 스타벅스 리프레셔 1개
        System.out.println("주세요");

        // 다른 자료형
        // int
        int[] i = new int[2];
        i[0] = 2;
        i[1] = 65;

        // double
        double[] d = new double[] { 180.0, 75.0 };

        // boolean
        boolean[] b = { true, false };

    }
}
