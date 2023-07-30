package chap_07;

// This

public class _07_This {
    public static void main(String[] args) {

        BlackBox b_one = new BlackBox();
        b_one.modelName = "까망이"; // 까망이(최신형)

        b_one.appendModelName("(최신형)");
        System.out.println(b_one.modelName);


    }
}
