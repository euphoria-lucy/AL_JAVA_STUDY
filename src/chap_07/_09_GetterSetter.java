package chap_07;

import java.util.concurrent.BlockingDeque;

public class _09_GetterSetter {
    public static void main(String[] args) {

        BlackBox b_one = new BlackBox();
        b_one.modelName = "까망이";
        b_one.resolution = "FHD";
        b_one.price = 650000;
        b_one.color = "블랙";

        // 할인행사
        b_one.price = -5000;
        System.out.println("가격 : " + b_one.price + " 원");

        // 고객 문의
        System.out.println("해상도 : " + b_one.resolution);

        System.out.println("-------------------------------------");

        BlackBox b_two = new BlackBox();
        b_two.modelName = ("하양이");
        b_two.setPrice(-5000);
        b_two.setColor("화이트");

        System.out.println("가격 : " + b_two.getPrice() + " 원");
        System.out.println("해상도 : " + b_two.getResolution());

    }
}
