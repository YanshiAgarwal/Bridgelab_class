package Java_Methods;

public class L2Problem5 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 5;
        double liters = 20;

        System.out.println(fahrenheit + " °F in Celsius = " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println(celsius + " °C in Fahrenheit = " + convertCelsiusToFahrenheit(celsius));
        System.out.println(pounds + " pounds in kilograms = " + convertPoundsToKilograms(pounds));
        System.out.println(kilograms + " kilograms in pounds = " + convertKilogramsToPounds(kilograms));
        System.out.println(gallons + " gallons in liters = " + convertGallonsToLiters(gallons));
        System.out.println(liters + " liters in gallons = " + convertLitersToGallons(liters));
    }
}

