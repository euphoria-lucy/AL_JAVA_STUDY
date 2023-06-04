package chap_04;

public class _01_IF {
    public static void main(String[] args) {

        // 조건문 IF

        int hour = 65;

        // if문에서 하나의 문장을 실행할 때는 { 중괄호 } 생략 가능
        if (hour < 37)
            System.out.println("아기짐승 홈런");

        // if문에서 2개 이상의 문장을 실행할 때는 { 중괄호 } 생략 불가
        if (hour > 37) {
            System.out.println("아기짐승 홈런");
            System.out.println("말랑콩떡 안타");
        }
        System.out.println("이브이 승리!");

        int time = 2;
        boolean morningCoffee = true;
        
        if (time < 14 && morningCoffee == true) {
            System.out.println("자몽 허니 블랙티");
        }
        System.out.println("주문 완료");
        
        time = 65;
        morningCoffee = true;
        
        if (time >= 14 || morningCoffee) {
            System.out.println("딸기 요거트 스무디");
        }
        System.out.println("주문 완료");
        
    }
}
