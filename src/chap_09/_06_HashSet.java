package chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 : 중복 허용 X, 순서 보장 X
        HashSet<String> set = new HashSet<>();
        set.add("이마크");
        set.add("황런쥔");
        set.add("이제노");
        set.add("이해찬");
        set.add("나재민");
        set.add("종천러");
        set.add("박지성");
        set.add("박지성");
        set.add("이마크");
        set.add("이제노");

        System.out.println("NCT DREAM 멤버 수 : " + set.size());

        // 순회
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("--------------");

        // 확인
        if (set.contains("박지성")) {
            System.out.println("박지성 보러 출발");
        }

        System.out.println("---------------------------------");

        // 삭제
        System.out.println("NCT DREAM 멤버 수 (마크 졸업 전) : " + set.size()); // 7
        set.remove("이마크");
        System.out.println("NCT DREAM 멤버 수 (마크 졸업 후) : " + set.size()); // 6

        System.out.println("---------------------------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("멤버 수 : " + set.size());
            System.out.println("항의하러 출발");
        }

        System.out.println("-----------");

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(802);
        intSet.add(323);
        intSet.add(423);
        intSet.add(606);
        intSet.add(813);
        intSet.add(1122);
        intSet.add(205);

        for (int i : intSet) {
            System.out.println(i);
        }
    }
}
