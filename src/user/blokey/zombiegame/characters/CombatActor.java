package user.blokey.zombiegame.characters;

import user.blokey.zombiegame.combat.AttackInfo;

/**
 * Author: Christopher Bates
 * Date: 31/07/13
 */
public interface CombatActor extends Actor {

    public void takeCombatHit(AttackInfo info);

    public void attack();




}
