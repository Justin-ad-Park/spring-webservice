package com.pulmuone.webservice.post.service.oopSample.lsp.Game;

public abstract class Weapon implements IWeapon {
    protected String name;
    protected int attackPower;

    public Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void attack(EnemyCharacter otherCharacter) {
        // 공격 상황를 보여준다.
        showAttackStatus(otherCharacter.name);

        // 적의 HP를 깍는다.
        damage(otherCharacter);
    }

    @Override
    public void showAttackStatus(String targetName) {
        System.out.println(name + "(으)로 " + targetName + "(을)를 공격했다.");
    }

    @Override
    public void damage(EnemyCharacter otherCharacter) {
        otherCharacter.getDamage(attackPower);
    }
}
