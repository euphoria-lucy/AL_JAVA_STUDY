package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // LinkedList (링크드 리스트)
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("박지성");
        list.add("이제노");
        list.add("나재민");
        list.add("이마크");
        list.add("이해찬");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-------");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-------");

        // 추가
        list.addFirst("종천러");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------");

        list.addLast("황런쥔");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------------");

        System.out.println("학생 추가 전 (index 1) : " + list.get(1));
        list.add(1, "시즈니");
        System.out.println("학생 추가 후 (index 1) : " + list.get(1));
        System.out.println("학생 추가 후 (index 2) : " + list.get(2));

        System.out.println("----------------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("-----------------------");

        // 처음 학생과 마지막 학생이 전학
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst(); // 처음 데이터
        list.removeLast(); // 마지막 데이터
        System.out.println("남은 학생 수 (전학 후) : " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------");

        // 변경 (수강권 양도)
        list.set(0, "이해찬");
        System.out.println(list.get(0));

        System.out.println("-----------");

        // 확인
        System.out.println(list.indexOf("박지성"));

        if (list.contains("박지성")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }

        System.out.println("-----------------");

        // 전체 삭제
        list.clear();

        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-----------------");

        // 새로운 학기 시작
        list.add("박지성");
        list.add("이제노");
        list.add("나재민");
        list.add("이마크");
        list.add("이해찬");

        Collections.sort(list); // 정렬

        for (String s : list) {
            System.out.println(s);
        }
    }
}
