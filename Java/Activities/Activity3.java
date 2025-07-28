package Activities;

public class Activity3 {

    public static void main(String[] args) {
        // Step 1: Initialize seconds
        double seconds = 1000000000;

        // Step 2: Define orbital periods (in Earth years or seconds)
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        // Step 3: Calculate and print age on each planet
        System.out.println("Age on different planets:");

        double ageOnEarth = seconds / EarthSeconds;
        System.out.printf("Earth: %.2f years%n", ageOnEarth);
        System.out.printf("Mercury: %.2f years%n", ageOnEarth / MercurySeconds);
        System.out.printf("Venus: %.2f years%n", ageOnEarth / VenusSeconds);
        System.out.printf("Mars: %.2f years%n", ageOnEarth / MarsSeconds);
        System.out.printf("Jupiter: %.2f years%n", ageOnEarth / JupiterSeconds);
        System.out.printf("Saturn: %.2f years%n", ageOnEarth / SaturnSeconds);
        System.out.printf("Uranus: %.2f years%n", ageOnEarth / UranusSeconds);
        System.out.printf("Neptune: %.2f years%n", ageOnEarth / NeptuneSeconds);
    }
}