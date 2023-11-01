package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_methodOverriding {
    public static void main(String[] args) {

        // methodOverloading : 같은 클래스 내에서 똑같은 이름을 가진 메소드를 파라미터의 개수나 타입을 다르게 함으로써 여러 개 정의할 수 있음
        // methodOverriding : 자식 클래스에서 부모 클래스의 메소드를 덮어 쓰는 동작을 함 → 부모 클래스에 정의되어 있는 어떤 메소드를 자식 클래스에서 재정의함으로써 자식 클래스의 메소드가 호출되도록 동작

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }
}
