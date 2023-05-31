package chap_02;

/* < 출력결과 >
키가 115cm 이므로 탑승 불가능합니다.
키가 180cm 이므로 탑승 가능합니다. */

public class _Quiz_02 {
    public static void main(String[] args) {

        int height = 180;
        String result = (height >= 120)? "탑승 가능함" : "탑승 불가능함";
        System.out.println("키가 " + height + "cm 이므로 " + result);

    }
}
