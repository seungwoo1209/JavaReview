package variablesAndTypes.typeCasting;

public class typeCastingOperator {
    public static void main(String[] args) {
        long d = 10;
        // 타입 캐스팅 연산자를 통한 강제적 타입 대입
        long e = (long)10.233;
        double f = d;
        System.out.println(f); // 10.0

        Parent p = new Parent();
        Child c = new Child();

        Parent p2 = (Parent)c;
        Child c2 = (Child)p2;

    }
}

class Parent {
    String name;
    int age;
}

class Child extends Parent {
    int number;
}