package chap_03;

public class _03_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("랜더스");
        System.out.println("아기짐승");
        System.out.println("김정민");

        // \n : 줄바꿈
        System.out.println("아기짐승\n말랑콩떡\n김정민");

        // \t : 탭
        System.out.println("생년월일 :\t040307"); // 출력 → 생년월일 :	040307

        // \\ : 역슬래시
        System.out.println("C\\Program Files\\Java"); // 출력 → C\Program Files\Java

        // \" : 큰따옴표
        System.out.println("성한이가 \"홈런\"을 쳤어요"); // 출력 → 성한이가 "홈런"을 쳤어요

        // \' : 작은따옴표
        System.out.println("성한이가 \'안타\'를 쳤어요"); // 출력 → 성한이가 '안타'를 쳤어요

        char c = 'A';
        c = '\'';
        System.out.println(c); // 출력 → '

    }
}
