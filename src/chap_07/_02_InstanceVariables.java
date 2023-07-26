package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {

        // 첫번째
        BlackBox b_one = new BlackBox();
        b_one.modelName = "말랑콩떡";
        b_one.resolution = "FHD";
        b_one.price = 6500000;
        b_one.color = "블랙";

        System.out.println(b_one.modelName);
        System.out.println(b_one.resolution);
        System.out.println(b_one.price);
        System.out.println(b_one.color);

        System.out.println("--------------------");

        // 새제품
        BlackBox b_two = new BlackBox();
        b_two.modelName = "기리보이";
        b_two.resolution = "FHD";
        b_two.price = 9500000;
        b_two.color = "화이트";

        System.out.println(b_two.modelName);
        System.out.println(b_two.resolution);
        System.out.println(b_two.price);
        System.out.println(b_two.color);

    }
}
