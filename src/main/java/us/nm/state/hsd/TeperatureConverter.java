package us.nm.state.hsd;

public class TeperatureConverter {
    public static double celiusToFahrenheit(double celsiustemperature) {
	return celsiustemperature * 9 / 5 + 32;
    }

    public static double celsiusToKelvin(double celsius) {
	return 273.15 + celsius;
    }

    public static double kelvinToFahrenheit(double kelvin, int K) {
	return (9/5*(K - 273) + 32) ; 
    }

    public static double kelvinToCelsius(double kelvin) {
	return (kelvin-273.15);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
	return (fahrenheit - 32)* 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
	throw new UnsupportedOperationException("Not yet implemented"); // TODO Complete implementation
    }

}
