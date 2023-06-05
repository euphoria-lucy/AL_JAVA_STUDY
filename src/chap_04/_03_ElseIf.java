package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 Elseif
        // else-if : 여러번 사용 가능

        // 자몽 허니 블랙티가 있음
        // 또는 딸기 요거트 스무디가 있거나
        // 또는 초콜릿 크림 칩 프라푸치노

        boolean Grapefruit_Honey_Black_Tea = true;
        boolean Strawberry_Yogurt_Smoothie = true;
        boolean Chocolate_Cream_Chip_Frappuccino = true;
        
        if (Grapefruit_Honey_Black_Tea) {
            System.out.println("자몽 허니 블랙티");
        } else if (Strawberry_Yogurt_Smoothie) {
            System.out.println("딸기 요거트 스무디");
        } else if (Chocolate_Cream_Chip_Frappuccino) {
            System.out.println("초콜릿 크림 칩 프라푸치노");
        }

        System.out.println("주문 완료");

    }
}
