package dev.pablo;

import dev.pablo.Enumerations.PlanetType;

public final class App {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 5, 1, 12756, 149, PlanetType.TERRESTRIAL, true);
        Planet jupiter = new Planet("Jupiter", 79, 1, 1, 142984, 778, PlanetType.GAS_GIANT, true);

        System.out.println("Earth Attributes:");
        System.out.println(earth.getAttributes());
        System.out.println("Density: " + earth.calculateDensity() + " kg/m³");
        System.out.println("Is outer planet: " + earth.isOuterPlanet());

        System.out.println("\nJupiter Attributes:");
        System.out.println(jupiter.getAttributes());
        System.out.println("Density: " + jupiter.calculateDensity() + " kg/m³");
        System.out.println("Is outer planet: " + jupiter.isOuterPlanet());
    }
}
