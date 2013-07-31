package user.blokey.zombiegame.map.locationgenerator;

import user.blokey.zombiegame.map.location.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: Christopher Bates
 * Date: 31/07/13
 */
public class BasicLocationGenerator implements LocationGenerator {

    private Random randomGenerator;
    private long seed;

    /**
     * Constructs a new Basic Location Generator with a randomly generated seed
     */
    public BasicLocationGenerator() {
        this(new Random().nextLong());
    }

    public BasicLocationGenerator(long seed) {
        this.seed = seed;
        this.randomGenerator = new Random(seed);
    }

    @Override
    public Location generateLocations(int numberOfLocations) {

        List<Location> locationList = generateLocationList(numberOfLocations);

        connectLocations(locationList);

        return null;
    }



    private List<Location> generateLocationList(int numberOfLocations) {

        List<Location> locationList = new ArrayList<Location>();


        for(int i = 0; i < numberOfLocations; i++) {

            locationList.add(generateLocation(randomGenerator.nextLong()));

        }


        return locationList;
    }

    private void connectLocations(List<Location> locationList) {

    }

    private Location generateLocation(long locationSeed) {
        return null; // TODO generating locations
    }


    public long getSeed() {
        return seed;
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }


}

