package chap_07;

// 클래스 메소드
public class _06_ClassMethod {
    public static void main(String[] args) {

        BlackBox b_one = new BlackBox();
        b_one.callServiceCenter();

        BlackBox b_two = new BlackBox();
        b_two.callServiceCenter();

        System.out.println("----------------------------------");

        BlackBox.callServiceCenter();

        String s = String.valueOf(7);

    }
}
