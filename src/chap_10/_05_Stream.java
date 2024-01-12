package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성
        int[] scores = {205, 423, 606, 813, 825};
        IntStream scoreStream = Arrays.stream(scores);

        // Arrays.stream
        String[] langs = {"박지성", "이제노", "이해찬", "이마크", "나재민"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("박지성");
        // langList.add("이제노");
        langList = Arrays.asList("박지성", "이제노", "이해찬", "이마크", "나재민");
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("박지성", "이제노", "이해찬", "이마크", "나재민");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch ...

        // 205점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 205).forEach(x -> System.out.println(x));

        System.out.println("-------");

        Arrays.stream(scores).filter(x -> x >= 205).forEach(System.out::println);

        System.out.println("-------");

        // 205점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 205).count();
        System.out.println(count);

        System.out.println("-------");

        // 205점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 205).sum();
        System.out.println(sum);

        System.out.println("-------");

        // 205점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 205).sorted().forEach(System.out::println);

        System.out.println("-------");

        // "박지성", "이제노", "이해찬", "이마크", "나재민"
        // 이로 시작하는 이름
        Arrays.stream(langs).filter(x -> x.startsWith("이")).forEach(System.out::println);

        System.out.println("-------");

        // 박지성이라는 글자를 포함하는 이름
        Arrays.stream(langs).filter(x -> x.contains("박지성")).forEach(System.out::println);

        System.out.println("-------");

        // 3글자 이하의 이름을 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 3).sorted().forEach(System.out::println);

        System.out.println("-------");

        // 3글자 이하의 이름 중에서 이라는 글자를 포함하는 이름
        langList.stream().filter(x -> x.length() <= 3).filter(x -> x.contains("이")).forEach(System.out::println);

        System.out.println("-------");

        // 3글자 이하의 이름 중에서 박이라는 글자를 포함하는 이름이 하나라도 있는지 여부
        boolean anyMatch = langList.stream().filter(x -> x.length() <= 3).anyMatch(x -> x.contains("박"));
        System.out.println(anyMatch);

        System.out.println("-------");

        // 3글자 이하의 단어들은 모두 박이라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("박"));
        System.out.println(allMatch);

        System.out.println("-------");

        // 3글자 이하의 이름 중에서 박이라는 글자를 포함하는 언어 뒤에 (잘생겼어요) 라는 글자를 함께 출력
        // map
        langList.stream().filter(x -> x.length() <= 3).filter(x -> x.contains("박")).map(x -> x + " 잘생겼어요").forEach(System.out::println);

        System.out.println("---------------");

        // 이라는 글자를 포함하는 이름을 대문자로 출력 (영어만)
        langList.stream().filter(x -> x.contains("이")).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("-------");

        // 이라는 글자를 포함하는 이름을 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithLee = langList.stream().filter(x -> x.contains("이")).map(String::toUpperCase).collect(Collectors.toList());

        langListStartsWithLee.stream().forEach(System.out::println);
    }
}
