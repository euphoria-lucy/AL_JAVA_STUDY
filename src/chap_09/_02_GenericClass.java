package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(65);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("김정민");
        c2.ready();

        System.out.println("--------------------");

        CoffeeByName c3 = new CoffeeByName(06);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("류현곤");
        c4.ready();

        System.out.println("--------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name;

        System.out.println("--------------------");

        Coffee<Integer> c5 = new Coffee<>(2);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("박성한");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("---------------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("정은원"));
        c7.ready();

        CoffeeByUser<VIPUser> c8 = new CoffeeByUser<>(new VIPUser("문동주"));
        c8.ready();

        System.out.println("---------------------------------");

        orderCoffee("김혜성");
        orderCoffee(65);

        System.out.println("---------------------------------------");

        orderCoffee("김주원", "여수 바다 자몽 피지오");
        orderCoffee("이재현", "아이스 핑크 캐모마일 릴렉서");

        System.out.println("---------------------------------------");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }

}
