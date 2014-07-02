package nl.revolution.codechallenge;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HouseHuntTest {

    @Test
    public void isValidHouseNumberPair() {
        HouseHunt houseHunt = new HouseHunt();
        assertThat(houseHunt.isValidHouseNumberPair(1, 1), is(false));
        assertThat(houseHunt.isValidHouseNumberPair(6, 8), is(true));
        assertThat(houseHunt.isValidHouseNumberPair(35, 49), is(true));
        assertThat(houseHunt.isValidHouseNumberPair(1, 2), is(false));
    }
}