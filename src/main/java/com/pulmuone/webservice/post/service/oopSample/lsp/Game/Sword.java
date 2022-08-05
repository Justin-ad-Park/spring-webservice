package com.pulmuone.webservice.post.service.oopSample.lsp.Game;

public class Sword extends Weapon {
    public Sword() {
        super("단검", 1);
    }

    public Sword(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public void showAttackStatus(String targetName) {
        System.out.println(name + "(으)로 " + targetName + "(을)를 베었다.");
    }
}
