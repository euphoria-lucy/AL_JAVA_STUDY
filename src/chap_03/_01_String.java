package chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "mallangkongtteog Kimjungmin";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 출력 → 27

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 출력 → MALLANGKONGTTEOG KIMJUNGMIN. toUpperCase() → 대문자로 변환
        System.out.println(s.toLowerCase()); // 출력 → mallangkongtteog kimjungmin. toLowerCase() → 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Kimjungmin")); // 포함된다면 true 출력. 출력 → true
        System.out.println(s.contains("65")); // 포함되지 않았다면 false 출력. 출력 → false
        System.out.println(s.indexOf("Kimjungmin")); // 위치 정보 출력. 출력 → 17
        System.out.println(s.indexOf("65")); // 포함되지 않는다면 -1 출력. 출력 → -1
        System.out.println(s.indexOf("mallangkongtteog")); // 처음 일치하는 위치 정보. 출력 → 0
        System.out.println(s.lastIndexOf("Kimjungmin")); // 마지막 일치하는 위치 정보. 출력 → 17
        System.out.println(s.startsWith("mallangkongtteon")); // 이 문자로 시작하면 true 출력, 아니면 false 출력. 출력 → false
        System.out.println(s.endsWith("Kimjungmin")); // 이 문자열로 끝나면 true 출력, 아니면 false 출력. 출력 → true

        // 문자열 변환
        System.out.println(s.replace("j", "J")); // "j"를 "J"로 변환.
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작 (이전 내용은 삭제).
        System.out.println(s.substring(s.indexOf("mallangkongtteog"))); // "mallangkongtteog"가 시작하는 위치부터.
        System.out.println(s.substring(s.indexOf("mallangkongtteog"), s.indexOf("m"))); // 시작 위치부터 끝 위치 "직전".

        // 공백 제거
        String kjm = "      Kim jung min        ";
        System.out.println(kjm);// 출력 →      Kim jung min
        System.out.println(s.trim()); // 앞뒤 공백 제거. 출력 → mallangkongtteog Kimjungmin

        // 문자열 결합
        String s1 = "SSG LANDERS";
        String s2 = "KiM Jung-Min";
        System.out.println(s1 + " " + s2); // 출력 → SSG LANDERS KiM Jung-Min
        System.out.println(s1 + " ♣ " + s2); // 출력 → SSG LANDERS ♣ KiM Jung-Min
        System.out.println(s1.concat(" ★ ".concat(s2))); // 출력 → SSG LANDERS ★ KiM Jung-Min

    }
}
