package com.pulmuone.webservice.post.service.oopSample.lsp.Game;

public class PlayGame {

    public static void main(String[] args)
    {
        Hero hero = new Hero();
        EnemyCharacter slime = new EnemyCharacter("슬라임",10,1);

        hero.attack(slime);
        hero.attack(slime);

        hero.getWeapon(new SteelSword());

        hero.attack(slime);
        hero.attack(slime);

        hero.getWeapon(new SteelBow());

        hero.attack(slime);
        hero.attack(slime);

    }
}
