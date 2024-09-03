package variablesAndTypes.typeCasting;

public class Upcasting {
    public static void main(String[] args) {
        Champion c = new Jhin();
        // c.crit(); !ERROR
        c.attack(); // 탕탕탕빵

        Jhin j = new Jhin();
        j.crit(); // 치명타!

        Champion c2 = new Champion();
        // Jhin c3 = (Jhin)c2;
        // c3.crit(); // ClassCastExecption. 컴파일러에서 잡지 못했음.

        if(j instanceof Champion){
            System.out.println("j is instance of Champion"); // 실행
        } else {
            System.out.println("j is not instance of Champion");
        }

        if(j instanceof Jhin){
            System.out.println("j is instance of Jhin"); // 실행
        } else {
            System.out.println("j is not instance of Jhin");
        }

        if(c instanceof Jhin){
            System.out.println("c is instance of Jhin"); // 실행
        } else {
            System.out.println("c is not instance of Jhin");
        }

        if(c2 instanceof Jhin){
            System.out.println("c2 is instance of Jhin");
        } else {
            System.out.println("c2 is not instance of Jhin"); // 실행
        }
    }
}

class Champion {
    public void attack() {
        System.out.println("챔피언이 공격합니다");
    }
}

class Jhin extends Champion {
    @Override
    public void attack() {
        System.out.println("탕탕탕빵");
    }

    public void crit() {
        System.out.println("치명타!");
    }
}