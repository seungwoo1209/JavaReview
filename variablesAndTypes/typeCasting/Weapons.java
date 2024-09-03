package variablesAndTypes.typeCasting;

public abstract class Weapons {

    String name;
    public abstract void fire();

    public Weapons(String name) {
        this.name = name;
    }

}

abstract class Gun extends Weapons {

    int ammo;

    public abstract void reload();

    public Gun(String name) {
        super(name);
        ammo = 0;
    }
}

class K2 extends Gun {

    @Override
    public void fire(){
        if(super.ammo > 0){
            System.out.println("탕탕탕!!");
            super.ammo--;
        } else {
            System.out.println("탄이 없다!!");
        }

    }

    @Override
    public void reload(){
        super.ammo = 5;
        System.out.println("5.56mm탄 5발 장전 완료");
    }

    public K2(String name) {
        super(name);
    }
}
