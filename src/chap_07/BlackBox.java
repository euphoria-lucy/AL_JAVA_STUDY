package chap_07;

public class BlackBox {
    // 인스턴스 변수
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    // 클래스 변수
    // 클래스로부터 만들어지는 모든 변수에 똑같이 적용됨
    static boolean canAutoReport = false; // 자동 신고 기능
    // static : 클래스 변수
    
    // 자동 신고 기능 메소드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    // 메모리 카드 용량 메소드
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // 블랙박스 내 영상 메모리 개수 메소드
    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 95;
        } else if (type == 2) { // 이벤트 영상
            return 65;
        }
        return 3;
    }

}
