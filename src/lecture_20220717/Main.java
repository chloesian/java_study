package lecture_20220717;

public class Main {
    public static void main(String[] args) {

        // Cat 클래스의 nabi라는 객체를 생성
        Cat nabi = new Cat();
        nabi.name = "나비";       // nabi의 속성 name을 초기화
        nabi.color = "yellow";   // nabi의 속성 color를 초기화
        nabi.age = 10;           // nabi의 속성 age를 초기화

        System.out.println("Cat의 개체 nabi의 name은 : " + nabi.name);
        System.out.println("Cat의 개체 nabi의 color는 : " + nabi.color);
        System.out.println("Cat의 개체 nabi의 age은 : " + nabi.age);

        Cat jebi = new Cat();
        jebi.name = "제비";
        jebi.color = "red";
        jebi.age = 1;

        System.out.println("Cat의 개체 jebi의 name은 : " + jebi.name);
        System.out.println("Cat의 개체 jebi의 color는 : " + jebi.color);
        System.out.println("Cat의 개체 jebi의 age은 : " + jebi.age);
    }
}
