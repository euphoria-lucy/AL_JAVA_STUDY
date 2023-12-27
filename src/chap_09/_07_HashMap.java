package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value) : 순서 보장 X, key값의 중복 허용 X
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("이마크", 802);
        map.put("황런쥔", 323);
        map.put("이제노", 423);
        map.put("이해찬", 606);
        map.put("나재민", 813);
        map.put("종천러", 1122);
        map.put("박지성", 205);

        System.out.println("NCT DREAM 멤버 수 : " + map.size());
        System.out.println("--------------------");

        // 조회
        System.out.println("이마크님의 포인트 : " + map.get("이마크"));
        System.out.println("황런쥔님의 포인트 : " + map.get("황런쥔"));
        System.out.println("이제노님의 포인트 : " + map.get("이제노"));
        System.out.println("이해찬님의 포인트 : " + map.get("이해찬"));
        System.out.println("나재민님의 포인트 : " + map.get("나재민"));
        System.out.println("종천러님의 포인트 : " + map.get("종천러"));
        System.out.println("박지성님의 포인트 : " + map.get("박지성"));

        System.out.println("---------------------------");

        // 확인
        if (map.containsKey("시즈니")) {
            int point = map.get("시즈니");
            map.put("시즈니", ++point);
            System.out.println("시즈니님의 누적 포인트 : " + map.get("시즈니"));
        } else {
            map.put("시즈니", 1);
            System.out.println("시즈니님의 신규 등록 (포인트 1)");
        }

        System.out.println("---------------------------");

        // 삭제
        map.remove("시즈니");
        System.out.println(map.get("시즈니"));

        System.out.println("---------------");

        // 전체삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("항의하러 출발....");
        }

        System.out.println("---------------");

        // 다시 돌아옴..
        map.put("이마크", 802);
        map.put("황런쥔", 323);
        map.put("이제노", 423);
        map.put("이해찬", 606);
        map.put("나재민", 813);
        map.put("종천러", 1122);
        map.put("박지성", 205);

        // Key 확인
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("-------");

        // Value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println("------------------------------");

        // Key & Value 함께 확인
        for (String key : map.keySet()) {
            System.out.println("멤버 이름 : " + key + "\t\t생일 : " + map.get(key));
        }

        System.out.println("-------------------------------");

        map.put("시즈니", 825);
        map.put("시즈니", 612);

        for (String key : map.keySet()) {
            System.out.println("멤버 이름 : " + key + "\t\t생일 : " + map.get(key));
        }
    }
}
