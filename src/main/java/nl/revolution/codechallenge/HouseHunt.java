package nl.revolution.codechallenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.stream.IntStream;


public class HouseHunt {

    private static final Logger LOG = LoggerFactory.getLogger(HouseHunt.class);

    public static void main(String... args) throws IOException {
        new HouseHunt().findHouseNumbers();
    }

    public void findHouseNumbers() {
        long start = System.currentTimeMillis();

        LOG.info("Duration: " + (System.currentTimeMillis() - start) + " ms.");
    }

    boolean isValidHouseNumberPair(int ownHouseNumber, int lastHouseNumber) {
        int sumOfLowerHouseNumbers = IntStream.range(1, ownHouseNumber).parallel().sum();
        int sumOfHigherHouseNumbers = IntStream.rangeClosed(ownHouseNumber + 1, lastHouseNumber).parallel().sum();
        return (sumOfLowerHouseNumbers == sumOfHigherHouseNumbers) && (lastHouseNumber != 1);
    }

}

