package chap_06;

public class _07_VariableScope {

    public static void method() {
        int result = 2; // 지역변수 : 선언된 영역 안에서만 사용 가능
    }

    public static void main(String[] args) {

        int number = 65;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

}
