package dev.pablo;

import dev.pablo.Enumerations.PlanetType;

public final class App {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12756, 149.6, PlanetType.TERRESTRIAL, true);
        Planet jupiter = new Planet("Jupiter", 79, 1.898e27, 1.43128e15, 142984, 778.5, PlanetType.GAS_GIANT, true);

        System.out.println("Earth Attributes:");
        System.out.println(earth.getAtributes());
        System.out.println("Density: " + earth.calculateDensity() + " kg/m³");
        System.out.println("Is outer planet: " + earth.isOuterPlanet());

        System.out.println("\nJupiter Attributes:");
        System.out.println(jupiter.getAtributes());
        System.out.println("Density: " + jupiter.calculateDensity() + " kg/m³");
        System.out.println("Is outer planet: " + jupiter.isOuterPlanet());
    }
}
