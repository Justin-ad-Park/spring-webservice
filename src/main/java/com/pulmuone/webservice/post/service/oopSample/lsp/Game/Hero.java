package com.pulmuone.webservice.post.service.oopSample.lsp.Game;

// 주인공
public class Hero {
    private final String name = "Adol Christin";  //이스 주인공
    private int hp = 100; // 초기 체력 Hits point
    private Weapon weapon;	// 무기

    public Hero () {
        weapon = new Sword();  //주인공은 기본 무기 단검을 가지고 있음
    }

    public void attack(EnemyCharacter otherCharacter) {
        weapon.attack(otherCharacter);
    }

    public void getWeapon(Weapon newWeapon) {
        weapon = newWeapon;
        System.out.println(name + " 이 새로운 무기 " + weapon.name + "(을)를 얻었다.");
    }
}