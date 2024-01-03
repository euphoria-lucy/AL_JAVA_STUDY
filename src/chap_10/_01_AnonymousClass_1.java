package chap_10;

public class _01_AnonymousClass_1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("핑크 폼 딸기 라떼");

        System.out.println("-----------------------------------");

        Coffee c2 = new Coffee();
        c2.order("여수 바다 자몽 피지오");

        System.out.println("----------------------------------------------------");

        // 친한 친구 방문
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("베어리스타 우유 생크림 케이크는 서비스에요. (˵ •̀ ᴗ - ˵ ) ✧");
            }

            @Override
            public void returnTray() {
                System.out.println("자리에 두시면 제가 치울게요. (˵ •̀ ᴗ - ˵ ) ✧");
            }
        };

        specialCoffee.order("아이스 자몽 허니 블랙 티");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("트레이 반납이 완료되었습니다.");
    }
}
