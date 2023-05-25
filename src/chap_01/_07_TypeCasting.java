package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 → 실수형
        // 실수형 → 정수형

        // int to float, double
        int score = 65;
        System.out.println(score); // 출력 → 65
        System.out.println((float)score); // 출력 → 65.0
        System.out.println((double)score); // 출력 → 65.0

        // float, double to int
        float score_f = 65.1F;
        double score_d = 43.7;
        System.out.println((int) score_f); // 출력 → 65
        System.out.println((int) score_d); // 출력 → 43

        // 정수 + 실수 연산
        score = 65 + (int)37.4; // → 65 + 37
        System.out.println(score); // 출력 → 102

        // 실수형일 경우 형변환을 하지 않아도 정수형이 자동으로 실수형으로 형변환됨
        score_d = 65 + 37.4; // → 65.0 + 37.4
        System.out.println(score_d); // 출력 → 102.4

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 102 → 102.0
        // int → long → float  double (자동 형변환)

        int convertedScoreInt = (int)score_d; // 102.0 → 102
        // double → float → long → int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(65);
        s1 = Integer.toString(65);
        System.out.println(s1); // 출력 → 65

        String s2 = String.valueOf(37.4);
        s2 = Double.toString(37.4);
        System.out.println(s2); // 출력 → 37.4

        // 문자열을 숫자로
        int i = Integer.parseInt("65");
        System.out.println(i); // 출력 → 65
        double d = Double.parseDouble("37.4");
        System.out.println(d); // 출력 → 37.4



    }
}
