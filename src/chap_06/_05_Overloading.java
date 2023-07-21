package chap_06;

// 메소드 오버로딩
// 같은 이름의 메소드를 여러 번 선언
// 1. 전달값의 타입이 다르거나
// 2. 전달값의 갯수가 다르거나
// 똑같은 이름의 메소드를 중복해서 사용하는 것
// 전달값의 자료형이 다르거나 전달값의 갯수가 서로 다르면, 같은 이름의 메소드를 중복해서 정의할 수 있음
public class _05_Overloading {

    public static int getPower (int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    /* 코드 자동 정렬
         윈도우 : Ctrl + Alt + L
         맥 : Command + Option + L */

    public static int getPower (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 9
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
        // 전달하는 값의 자료형에 따라 전달값의 메소드를 각각 출력
        // 오버로딩 : 전달값의 자료형이 다르거나 갯수가 다르면 똑같은 이름의 메소드를 중복해서 사용할 수 있음
    }

}
