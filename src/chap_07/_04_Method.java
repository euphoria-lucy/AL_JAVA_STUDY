package chap_07;

public class _04_Method {
    public static void main(String[] args) {

        BlackBox b_one = new BlackBox();
        b_one.modelName = "손자짐승";

        b_one.autoReport(); // 지원 X
        BlackBox.canAutoReport = true;
        b_one.autoReport(); // 지원 O

        b_one.insertMemoryCard(256);

        // 일반 영상 → 1 (type)
        // 이벤트 영상 (충돌 감지) → 2
        int fileCount = b_one.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수 → " + fileCount + " 개");

        fileCount = b_one.getVideoFileCount(2); // 이벤트 영상
        System.out.println("일반 영상 파일 수 → " + fileCount + " 개");

    }
}
