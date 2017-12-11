
package jp.ac.uryukyu.ie.e175725;


public class Enemy extends LivingThing {

    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    int HP = getHitPoint();
    @Override
    public void wounded(int damage){

        HP -= getHitPoint();

        if (HP < 0) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}