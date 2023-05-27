package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        /* 변수 이름 짓는 법
        ①. 저장할 값에 어울리는 이름
        ② 밑줄(_), 문자, 숫자 사용 가능 (공백 사용 불가)
        ③. 밑줄 또는 문자로 시작 가능
        ④. 한 단어 또는 2개 이상 단어의 연속
        ⑤. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        ⑥. 예약어 사용 불가 (public, static, void, int, double, float ...) */
        
        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "정민"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2004-03-07"; // 생년월일
        String residentialAddress = "호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE651"; // 항공편명

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류기간

        String item1 = "향수";
        String item2 = "시계";

        // 프로그램의 흐름을 위해 사용되는 경우 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = " ";
        String str = " ";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";

    }
}
