package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {

        BlackBox b_one = new BlackBox();
        b_one.modelName = "말랑콩떡";
        System.out.println(b_one.modelName);

        BlackBox b_two = new BlackBox();
        b_two.modelName = "기리보이";
        System.out.println(b_two.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("          ▷ 개발 전 ◁          ");
        System.out.println(b_one.modelName + " 자동 신고 기능 : " + b_one.canAutoReport);
        System.out.println(b_two.modelName + " 자동 신고 기능 : " + b_two.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        System.out.println();

        // 기능 개발
        BlackBox.canAutoReport = true;
        System.out.println("          ▷ 개발 후 ◁          ");
        System.out.println(b_one.modelName + " 자동 신고 기능 : " + b_one.canAutoReport);
        System.out.println(b_two.modelName + " 자동 신고 기능 : " + b_two.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

    }
}
