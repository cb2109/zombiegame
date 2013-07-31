package user.blokey.zombiegame.map.location;

import user.blokey.zombiegame.map.CompassDirection;

/**
 * Author: Christopher Bates
 * Date: 31/07/13
 */
public interface PassableLocation extends Location {

    public Location getAdjacentLocations();

    public boolean move(CompassDirection direction);

}
