package chap_07.camera;

public class Camera { // 부모 클래스
    public String name;

    // 가지고 있는 인스턴스 변수를 외부로부터 전달받아 값을 설정할 수 있는 메소드
    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " :  동영상을 녹화합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }
}
