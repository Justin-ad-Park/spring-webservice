package com.pulmuone.webservice.post.service.oopSample.lsp.Game;

public interface IWeapon {
    void attack(EnemyCharacter otherCharacter);
    void showAttackStatus(String targetName);
    void damage(EnemyCharacter otherCharacter);
}