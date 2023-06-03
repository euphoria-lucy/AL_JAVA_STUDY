package chap_03;

public class _02_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "mallangkongtteog";
        String s2 = "Kim Jung-Min";

        // 문자열 내용이 같으면 true, 다르면 false.
        System.out.println(s1.equals("mallangkongtteog")); // 출력 → true

        // 대소문자 구분 없이 문자열 내용이 같은지 동일 여부.
        System.out.println(s2.equalsIgnoreCase("kim jung-min")); // 출력 → true

        // 문자열 비교 심화
        String s3 = "0307"; // 참조
        String s4 = "0307";

        System.out.println(s3.equals(s4)); // 출력 → true (내용)
        System.out.println(s3 == s4); // 출력 → true (참조)

        s3 = new String("040307");
        s4 = new String("040307");
        System.out.println(s3.equals(s4)); // 출력 → true
        System.out.println(s3 == s4); // 출력 → false
    }
}
