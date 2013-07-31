package user.blokey.zombiegame.characters;

import user.blokey.zombiegame.map.Resident;

/**
 * Author: Christopher Bates
 * Date: 31/07/13
 */
public interface Actor extends Resident {

    public String getName();

    public void move();

}
