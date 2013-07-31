package user.blokey.zombiegame.map.location;

import user.blokey.zombiegame.map.CompassDirection;

/**
 * Author: Christopher Bates
 * Date: 31/07/13
 */
public abstract class AbstractLocation implements Location {

    private Location north;
    private Location east;
    private Location south;
    private Location west;

    @Override
    public Location getNorth() {
        return north;
    }

    @Override
    public Location getSouth() {
        return south;
    }

    @Override
    public Location getEast() {
        return east;
    }

    @Override
    public Location getWest() {
        return west;
    }

    public void setLocation(CompassDirection direction, Location l) {
        switch(direction){
            case NORTH:
                this.north = l;
                break;
            case EAST:
                this.east = l;
                break;
            case SOUTH:
                this.south = l;
                break;
            case WEST:
                this.west = l;
                break;
        }


    }
}
