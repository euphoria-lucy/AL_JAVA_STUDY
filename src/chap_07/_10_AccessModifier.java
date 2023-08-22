package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {

        // 접근 제어자 : 접근을 제어하는 것
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b_one = new BlackBoxRefurbish();
        b_one.modelName = "까망이";
        b_one.resolution = "FHD";
        b_one.setPrice(650000);
        b_one.color = "블랙";

        // 할인행사
        b_one.setPrice(-5000);
        System.out.println("가격 : " + b_one.getPrice() + " 원");

        // 고객 문의
        System.out.println("해상도 : " + b_one.resolution);

        System.out.println("-------------------------------------");

        BlackBoxRefurbish b_two = new BlackBoxRefurbish();
        b_two.modelName = ("하양이");
        b_two.setPrice(-5000);
        b_two.setColor("화이트");

        System.out.println("가격 : " + b_two.getPrice() + " 원");
        System.out.println("해상도 : " + b_two.getResolution());

    }
}
