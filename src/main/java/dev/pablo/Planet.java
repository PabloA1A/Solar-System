package dev.pablo;

import dev.pablo.Enumerations.PlanetType;

public class Planet {
    private String name;
    private int numberOfSatellites;
    private double mass;
    private double volume;
    private int diameter;
    private double averageDistanceToSun;
    private PlanetType planetType;
    private boolean visibleToNakedEye;

    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter,
            double averageDistanceToSun, PlanetType planetType, boolean visibleToNakedEye) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceToSun = averageDistanceToSun;
        this.planetType = planetType;
        this.visibleToNakedEye = visibleToNakedEye;
    }

    public String getAtributes() {
        return "Name: " + name +
                "\nNumber of Satellites: " + numberOfSatellites +
                "\nMass (kg): " + mass +
                "\nVolume (km³): " + volume +
                "\nDiameter (km): " + diameter +
                "\nAverage Distance to Sun (million km): " + averageDistanceToSun +
                "\nPlanet Type: " + planetType +
                "\nVisible to Naked Eye: " + visibleToNakedEye;
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        double distanceInAU = averageDistanceToSun / 149.6;
        return distanceInAU > 3.4;
    }
}
