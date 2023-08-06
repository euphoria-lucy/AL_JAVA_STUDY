package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {

        BlackBox b_one = new BlackBox();
        b_one.modelName = "까망이";
        b_one.resolution = "FHD";
        b_one.price = 650000;
        b_one.color = "블랙";
        System.out.println(b_one.modelName);
        System.out.println(b_one.serialNumber);

        System.out.println("----------------------------");

        BlackBox b_two = new BlackBox("하양이", "UHD", 950000, "화이트");
        System.out.println(b_two.modelName);
        System.out.println(b_two.serialNumber);

    }
}
