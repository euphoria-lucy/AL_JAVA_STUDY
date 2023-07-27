package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {

        BlackBox b_one = new BlackBox();
        b_one.modelName = "손자짐승";

        b_one.record(false, false, 10);
        System.out.println("--------------------------------------------");
        b_one.record(true, false, 3);
        System.out.println("--------------------------------------------");
        b_one.record(true, true, 5);
        System.out.println("--------------------------------------------");
        b_one.record();

        // String
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));

    }
}
