import java.util.*;
import java.util.Scanner;

public class UnitConverter {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select your conversion:");
        System.out.println("1. Length\n2. Area\n3. Volume\n4. Weight\n5. Temperature");
        int option = sc.nextInt();

        switch (option) {
            case 1: handleLength(); break;
            case 2: handleArea(); break;
            case 3: handleVolume(); break;
            case 4: handleWeight(); break;
            case 5: handleTemperature(); break;
            default: System.out.println("Invalid option.");
        }
    }

    // Length Conversion
    private static void handleLength() {
        String[] units = {"mm", "cm", "m", "km", "mile", "inch", "ft", "yard"};
        printMenu("Length units", units);
        int from = sc.nextInt() - 1;
        printMenu("Convert to", units);
        int to = sc.nextInt() - 1;
        System.out.println("Enter value in " + units[from] + ":");
        double value = sc.nextDouble();

        double meters = toMeters(value, from, units);
        double result = fromMeters(meters, to, units);
        System.out.printf("%.6f %s = %.6f %s\n", value, units[from], result, units[to]);
    }

    private static double toMeters(double value, int from, String[] units) {
        switch (units[from]) {
            case "mm": return value / 1000;
            case "cm": return value / 100;
            case "m":  return value;
            case "km": return value * 1000;
            case "mile": return value * 1609.344;
            case "inch": return value * 0.0254;
            case "ft": return value * 0.3048;
            case "yard": return value * 0.9144;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    private static double fromMeters(double meters, int to, String[] units) {
        switch (units[to]) {
            case "mm": return meters * 1000;
            case "cm": return meters * 100;
            case "m":  return meters;
            case "km": return meters / 1000;
            case "mile": return meters / 1609.344;
            case "inch": return meters / 0.0254;
            case "ft": return meters / 0.3048;
            case "yard": return meters / 0.9144;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    // Area Conversion
    private static void handleArea() {
        String[] units = {"mm2", "cm2", "m2", "km2", "inch2", "ft2", "yd2", "acre", "hectare"};
        printMenu("Area units", units);
        int from = sc.nextInt() - 1;
        printMenu("Convert to", units);
        int to = sc.nextInt() - 1;
        System.out.println("Enter area in " + units[from] + ":");
        double value = sc.nextDouble();

        double sqMeters = toSquareMeters(value, from, units);
        double result = fromSquareMeters(sqMeters, to, units);
        System.out.printf("%.6f %s = %.6f %s\n", value, units[from], result, units[to]);
    }

    private static double toSquareMeters(double value, int from, String[] units) {
        switch (units[from]) {
            case "mm2": return value / 1_000_000;
            case "cm2": return value / 10_000;
            case "m2": return value;
            case "km2": return value * 1_000_000;
            case "inch2": return value * 0.00064516;
            case "ft2": return value * 0.09290304;
            case "yd2": return value * 0.83612736;
            case "acre": return value * 4046.8564224;
            case "hectare": return value * 10000;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    private static double fromSquareMeters(double sqMeters, int to, String[] units) {
        switch (units[to]) {
            case "mm2": return sqMeters * 1_000_000;
            case "cm2": return sqMeters * 10_000;
            case "m2": return sqMeters;
            case "km2": return sqMeters / 1_000_000;
            case "inch2": return sqMeters / 0.00064516;
            case "ft2": return sqMeters / 0.09290304;
            case "yd2": return sqMeters / 0.83612736;
            case "acre": return sqMeters / 4046.8564224;
            case "hectare": return sqMeters / 10000;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    // Volume Conversion
    private static void handleVolume() {
        String[] units = {"mm3", "cm3", "m3", "ml", "L", "in3", "ft3"};
        printMenu("Volume units", units);
        int from = sc.nextInt() - 1;
        printMenu("Convert to", units);
        int to = sc.nextInt() - 1;
        System.out.println("Enter volume in " + units[from] + ":");
        double value = sc.nextDouble();

        double liters = toLiters(value, from, units);
        double result = fromLiters(liters, to, units);
        System.out.printf("%.6f %s = %.6f %s\n", value, units[from], result, units[to]);
    }

    private static double toLiters(double value, int from, String[] units) {
        switch (units[from]) {
            case "mm3": return value / 1_000_000;
            case "cm3": return value / 1000;
            case "m3": return value * 1000;
            case "ml": return value / 1000;
            case "L": return value;
            case "in3": return value * 0.016387064;
            case "ft3": return value * 28.316846592;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    private static double fromLiters(double liters, int to, String[] units) {
        switch (units[to]) {
            case "mm3": return liters * 1_000_000;
            case "cm3": return liters * 1000;
            case "m3": return liters / 1000;
            case "ml": return liters * 1000;
            case "L": return liters;
            case "in3": return liters / 0.016387064;
            case "ft3": return liters / 28.316846592;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    // Weight Conversion
    private static void handleWeight() {
        String[] units = {"mg", "g", "kg", "quintal", "tonne", "pound", "ounce", "newton"};
        printMenu("Weight units", units);
        int from = sc.nextInt() - 1;
        printMenu("Convert to", units);
        int to = sc.nextInt() - 1;
        System.out.println("Enter weight in " + units[from] + ":");
        double value = sc.nextDouble();

        double kg = toKilograms(value, from, units);
        double result = fromKilograms(kg, to, units);
        System.out.printf("%.6f %s = %.6f %s\n", value, units[from], result, units[to]);
    }

    private static double toKilograms(double value, int from, String[] units) {
        switch (units[from]) {
            case "mg": return value / 1_000_000;
            case "g": return value / 1000;
            case "kg": return value;
            case "quintal": return value * 100;
            case "tonne": return value * 1000;
            case "pound": return value * 0.45359237;
            case "ounce": return value * 0.0283495231;
            case "newton": return value / 9.80665;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    private static double fromKilograms(double kg, int to, String[] units) {
        switch (units[to]) {
            case "mg": return kg * 1_000_000;
            case "g": return kg * 1000;
            case "kg": return kg;
            case "quintal": return kg / 100;
            case "tonne": return kg / 1000;
            case "pound": return kg / 0.45359237;
            case "ounce": return kg / 0.0283495231;
            case "newton": return kg * 9.80665;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    // Temperature Conversion
    private static void handleTemperature() {
        String[] units = {"Celsius", "Fahrenheit", "Kelvin"};
        printMenu("Temperature units", units);
        int from = sc.nextInt() - 1;
        printMenu("Convert to", units);
        int to = sc.nextInt() - 1;
        System.out.println("Enter temperature in " + units[from] + ":");
        double value = sc.nextDouble();

        double celsius = toCelsius(value, from);
        double result = fromCelsius(celsius, to);
        System.out.printf("%.2f %s = %.2f %s\n", value, units[from], result, units[to]);
    }

    private static double toCelsius(double value, int from) {
        switch (from) {
            case 0: return value;
            case 1: return (value - 32) * 5 / 9;
            case 2: return value - 273.15;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    private static double fromCelsius(double c, int to) {
        switch (to) {
            case 0: return c;
            case 1: return c * 9 / 5 + 32;
            case 2: return c + 273.15;
            default: throw new IllegalArgumentException("Unknown unit");
        }
    }

    // Utility
    private static void printMenu(String title, String[] units) {
        System.out.println("-- " + title + " --");
        for (int i = 0; i < units.length; i++) {
            System.out.printf("%d. %s\n", i + 1, units[i]);
        }
    }
}
