package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // iterator
        List<String> list = new ArrayList<>();

        list.add("이마크");
        list.add("(알 수 없음)");
        list.add("황런쥔");
        list.add("(알 수 없음)");
        list.add("이제노");
        list.add("(알 수 없음)");
        list.add("이해찬");
        list.add("(알 수 없음)");
        list.add("나재민");
        list.add("(알 수 없음)");
        list.add("종천러");
        list.add("(알 수 없음)");
        list.add("박지성");
        list.add("(알 수 없음)");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("----------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------");

        HashSet<String> set = new HashSet<>();
        set.add("이마크");
        set.add("황런쥔");
        set.add("이제노");
        set.add("이해찬");
        set.add("나재민");
        set.add("종천러");
        set.add("박지성");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("----------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("이마크", 802);
        map.put("황런쥔", 323);
        map.put("이제노", 423);
        map.put("이해찬", 606);
        map.put("나재민", 813);
        map.put("종천러", 1122);
        map.put("박지성", 205);

        // map.iterator(); // 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("----------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("----------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }

    }
}
