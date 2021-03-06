package us.nm.state.hsd;

public class TeperatureConverter {
    public static double celiusToFahrenheit(double celsiustemperature) {
	return celsiustemperature * 9 / 5 + 32;
    }

    public static double celsiusToKelvin(double celsius) {
	return 273.15 + celsius;
    }

    public static double kelvinToFahrenheit(double kelvin) {
	return (kelvin - 273.15) * 9 / 5 + 32; 
    }

    public static double kelvinToCelsius(double kelvin) {
	return (kelvin-273.15);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
	return (fahrenheit - 32)* 5.0/9.0;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
	return (fahrenheit - 32) * 5.0/9.0 + 273.15;
    }

}
