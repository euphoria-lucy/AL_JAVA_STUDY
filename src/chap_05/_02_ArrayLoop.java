package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {

        // 배열 순회
        String[] coffees = { "딸기 요거트 스무디", "자몽 허니 블랙티", "초콜릿 크림 칩 프라푸치노", "망고 용과 레모네이스 스타벅스 리프레셔" };
        System.out.println(coffees[0] + " 1개");

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 1개");
        }
        System.out.println("주세요");

        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        
        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 1개");
        }
        System.out.println("주세요");

        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        // enhanced for (for - each) 반복문
        // 인텔리제이에서는 for - each 반복문을 foreach로 하여 더욱 편리하게 사용할 수 있음
        /* for (String coffee : coffees) {
            System.out.println(coffee + " 1개");
        } */

        for (String coffee :
                coffees) {
            System.out.println(coffee + " 1개");
        }
        System.out.println("주세요");

    }
}
