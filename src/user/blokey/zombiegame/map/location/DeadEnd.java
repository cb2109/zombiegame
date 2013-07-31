package user.blokey.zombiegame.map.location;

import user.blokey.zombiegame.map.CompassDirection;

/**
 * Author: Christopher Bates
 * Date: 31/07/13
 */
public class DeadEnd extends AbstractLocation {



    public DeadEnd(Location previous, CompassDirection dirToPrevious) {
        this.setLocation(dirToPrevious, previous);
    }

    @Override
    public String getName() {
        return "Dead End";
    }

    @Override
    public String getDescription() {
        return "A dead end";
    }
}
