package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();

        System.out.println("------- 정수 -------");
        // System.out.printf("포맷", 값1, 값2, 값3, ...);
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 2, 0, 5); // 2 0 5
        System.out.printf("%d%n", 205); // 205
        System.out.printf("%7d%n", 205); // ____205 (7자리의 공간을 확보하고 나서 205 출력)
        System.out.printf("%07d%n", 205); // 0000205 (7자리의 공간 확보 후 205 출력하는데 빈 공간은 0 으로 채움)
        System.out.printf("%7d%n", -205); // ___-205
        System.out.printf("%+7d%n", 205); // ___+205 (항상 기호 표시)
        System.out.printf("%,17d%n", 700000000); // ________700,000,000 (세자리마다 콤마로 구분)

        System.out.printf("%-7d%n", 205); // 205____ (7자리의 공간을 확보하고 나서 왼쪽 정렬 205 출력)

        System.out.println("------- 실수 -------");
        System.out.printf("%f%n", Math.PI); // 3.141593 (일반 출력)
        System.out.printf("%.2f%n", Math.PI); // 3.14 (소수점 둘째자리)
        System.out.printf("%7.2f%n", Math.PI); // ___3.14 (7자리 공간 확보하고 소수점 둘째자리)
        System.out.printf("%-7.2f%n", Math.PI); // 3.14___ (왼쪽 정렬)
        System.out.printf("%07.2f%n", Math.PI); // 0003.14 (빈 공간을 0으로 채우기)
        System.out.printf("%+7.2f%n", Math.PI); // __+3.14 (항상 +- 기호 표시)

        System.out.println("------- 문자열 -------");
        System.out.printf("%s%n", "DREAM"); // DREAM
        System.out.printf("%7s%n", "DREAM"); // __DREAM (7자리 공간 확보하고 우측 정렬)
        System.out.printf("%-7s%n", "DREAM"); // DREAM__ (7자리 공간 확보하고 좌측 정렬)
        System.out.printf("%7.2s%n", "DREAM"); // _____DR (7자리 공간 확보하고 우측 정렬해서 2글자 출력)
        System.out.printf("%-7.2s%n", "DREAM"); // DR_____ (7자리 공간 확보하고 좌측 정렬해서 2글자 출력)

        System.out.println("------- 응용 -------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("박지성 " + 205 + " " + 825 + " " + 515); // 박지성 205 825 515.0
        System.out.println("이제노 " + 423 + " " + 825 + " " + 624); // 이제노 423 825 624.0
        System.out.println("이마크 " + 802 + " " + 825 + " " + 813.2); // 이마크 802 825 813.2

        System.out.println("------- 응용 -------");
        System.out.println("이름      영어  수학   평균"); // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "박지성", 205, 825, 515.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "이제노", 423, 825, 624.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "이마크", 802, 825, 813.2);

    }
}
