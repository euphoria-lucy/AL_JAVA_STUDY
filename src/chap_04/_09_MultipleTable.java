package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {

        // 구구단
        /*
        2 X 1 = 2
        ...
         */
        for (int i = 2; i <= 9 ; i++) {
            System.out.println("---- " + i + "단 ---- ");
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }
}
