package chap_06;

// Edit Configurations → '+' → Appliction
// → Main class (실행할 클래스) - _08_MainMethod → Program arguments (프로그램을 실행할 때 전달해주는 전달값이 됨) - 테스트 전달값 입니다.

public class _08_MainMethod {
    public static void main(String[] args) {

        for (String s : args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case "1" :
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default :
                    System.out.println("잘못된 입력입니다.");
            }
        } else {
            System.out.println("( 사용법 ) 1 ~ 3 메뉴 중 하나를 입력하세요");
        }

    }
}
