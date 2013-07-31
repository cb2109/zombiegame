package user.blokey.zombiegame.map;

import user.blokey.zombiegame.map.locationgenerator.BasicLocationGenerator;
import user.blokey.zombiegame.map.locationgenerator.LocationGenerator;
import user.blokey.zombiegame.map.location.Location;

import java.util.List;

/**
 * Author: Christopher Bates
 * Date: 31/07/13
 */
public class WorldMap implements Map {

    private static final int NUMBER_OF_LOCATIONS = 200;

    protected int dimensionx, dimensiony;
    protected List<List<Location>> mapGrid;
    private LocationGenerator locationGenerator;

    public WorldMap() {
        this(NUMBER_OF_LOCATIONS);
    }

    public WorldMap(int numberOfLocations) {

        locationGenerator = getLocationGenerator();
        mapGrid = plotMap(locationGenerator.generateLocations(numberOfLocations));

    }

    private List<List<Location>> plotMap(Location startLocation) {
        return null;
    }

    protected LocationGenerator getLocationGenerator() {
        return new BasicLocationGenerator();
    }

}
