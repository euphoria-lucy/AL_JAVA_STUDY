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
    }
}
