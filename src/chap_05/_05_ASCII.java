package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {

        // 아스키 코드(ASCII) : 미국 표준 코드
        char c = 'A'; // 알파벳 대문자(A)는 65

        System.out.println(c); // 출력 → A
        System.out.println((int)c); // 출력 → 65

        c = 'B';
        System.out.println(c); // 출력 → B
        System.out.println((int)c); // 출력 → 66

        c++;
        System.out.println(c); // 출력 → C
        System.out.println((int)c); // 출력 → 67

        c = 'a'; // 알파벳 소문자(a)는 97부터 시작
        System.out.println(c); // 출력 → a
        System.out.println((int)c); // 출력 → 97

        c = 'b';
        System.out.println(c); // 출력 → b
        System.out.println((int)c); // 출력 → 98

        c++;
        System.out.println(c); // 출력 → c
        System.out.println((int)c); // 출력 → 99

        c = '0'; // 숫자(0)는 48부터 시작

        System.out.println(c); // 출력 → 0
        System.out.println((int)c); // 출력 → 48

        c = '1';
        System.out.println(c); // 출력 → 1
        System.out.println((int)c); // 출력 → 49

        c++;
        System.out.println(c); // 출력 → 2
        System.out.println((int)c); // 출력 → 50

        // 세로 크기 10 X 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats_thr = new String[10][15];
        char ch = 'A';

        for (int i = 0; i < seats_thr.length; i++) {
            for (int j = 0; j < seats_thr[i].length; j++) {
                seats_thr[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats_thr.length; i++) { // 세로
            for (int j = 0; j < seats_thr[i].length; j++) { // 가로
                System.out.print(seats_thr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
