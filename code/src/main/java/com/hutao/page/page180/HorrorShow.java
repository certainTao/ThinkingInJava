package com.hutao.page.page180;

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

class DragonZilla implements DangerousMonster{
    public void menace(){}
    public void destroy(){}
}

interface Lethal{
    void kill();
}

//接口可通过继承（支持多继承）来扩展接口
interface Vampire extends DangerousMonster, Lethal{
    void drinkBlood();
}

class VeryBadVampire implements Vampire{
    public void menace(){}
    public void destroy(){}
    public void kill(){}
    public void drinkBlood(){}
}

public class HorrorShow {
    static void m(Monster m){
        m.menace();
    }
    static void d(DangerousMonster d){
        d.menace();
        d.destroy();
    }
    static void l(Lethal l){
        l.kill();
    }
    static void v(Vampire v){
        v.menace();
        v.destroy();
        v.kill();
        v.drinkBlood();
    }

    public static void main(String[] args) {
        DangerousMonster dangerousMonster = new DragonZilla();
        m(dangerousMonster);
        d(dangerousMonster);

        Vampire vampire = new VeryBadVampire();
        m(vampire);
        d(vampire);
        l(vampire);
        v(vampire);
    }
}
