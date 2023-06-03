package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        String id = "040307-3230429";
        System.out.println(id.substring(0, 8)); // 0 위치부터 8위치 직전까지 출력. 출력 → 040307-3
        id = "980330-10218077";
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 0 위치 부터 하이픈 위치 + 2 직전까지. 출력 → 980330-1

    }
}
