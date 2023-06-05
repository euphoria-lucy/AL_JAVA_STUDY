package chap_04;

public class _02_Else {
    public static void main(String[] args) {

        // 조건문 If Else
        int hour = 65;

        if (hour < 37) { // ~ 이전이면
            System.out.println("아기짐승 홈런!");
        } else { // 그 외의 경우이면
            System.out.println("아기짐승 안타!");
        }
        System.out.println("아기짐승 홈인");

        int time = 2;
        boolean morningCoffee = true;

        if (hour >= 14 || morningCoffee == true) { // 오후 2시 이후이거나 모닝 커피를 마신경우?
            System.out.println("자몽 허니 블랙티");
        } else { // 그 외의 경우이면
            System.out.println("딸기 요거트 스무디");
        }
        System.out.println("주문 완료");
    }
}
