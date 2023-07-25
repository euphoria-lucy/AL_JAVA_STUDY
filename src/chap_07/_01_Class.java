package chap_07;

// 객체 지향 프로그래밍 (OOP : Object - Oriented Programming)
// 유지보수 용이
// 높은 재사용성

public class _01_Class {
    public static void main(String[] args) {

        // 차량용 블랙박스

        // 첫 번째 제품
        // 모델명, 해상도, 가격, 색상
        String modelName = "말랑콩떡";
        String resolution = "FHD";
        int price = 650000;
        String color = "블랙";

        // 새로운 제품을 개발
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlockBox 클래스의 인스턴스

        BlackBox bbox_t = new BlackBox();

    }
}
