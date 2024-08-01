package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.pablo.Enumerations.PlanetType;

public class PlanetTest {
    private Planet earth;
    private Planet jupiter;

    @BeforeEach
    public void setUp() {
        earth = new Planet("Earth", 1, 6, 2, 12742, 150, PlanetType.TERRESTRIAL, true);
        jupiter = new Planet("Jupiter", 79, 10, 5, 139820, 778, PlanetType.GAS_GIANT, true);
    }

    @Test
    public void testGetAttributes() {
        String earthAttributes = earth.getAttributes();
        assertTrue(earthAttributes.contains("Name: Earth"));
        assertTrue(earthAttributes.contains("Number of Satellites: 1"));
        assertTrue(earthAttributes.contains("Planet Type: TERRESTRIAL"));
    }

    @Test
    public void testCalculateDensity() {
        double earthDensity = earth.calculateDensity();
        assertEquals(3, earthDensity, 0.01);

        double jupiterDensity = jupiter.calculateDensity();
        assertEquals(2, jupiterDensity, 0.01);
    }
}
