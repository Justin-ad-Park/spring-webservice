package com.pulmuone.webservice.post.service.oopSample.lsp.Game;

// 적 케릭터
public class EnemyCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;

    public EnemyCharacter (String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void getDamage(int damage) {
        hp = hp - damage;

        System.out.println(name + " HP :" + hp);
    }
}
