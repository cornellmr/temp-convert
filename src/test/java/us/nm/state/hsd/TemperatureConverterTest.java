package us.nm.state.hsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TemperatureConverterTest {
    static final double FAHRENHEIT_TOLERANCE = 0.001;
    static final double KELVIN_TOLERANCE = 0.0005556;
    static final double CELSIUS_TOLERANCE = 0.0005556;

//  celsiusToFahrenheit
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)

    void celsiusToFahrenheit(double celsius, double fahrenheit, double kelvin) {
	assertEquals(fahrenheit, TeperatureConverter.celiusToFahrenheit(celsius), FAHRENHEIT_TOLERANCE);
    }

//  celsiusToKelvin   
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celsiusToKelvin(double celsius, double fahrenheit, double kelvin) {
	assertEquals(celsius, TeperatureConverter.celsiusToKelvin(kelvin), KELVIN_TOLERANCE);
    }

//  kelvinTofahrenheit
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void kelvinTofahrenheit(double celsius, double fahrenheit, double kelvin) {
	assertEquals(kelvin, TeperatureConverter.celiusToFahrenheit(fahrenheit), FAHRENHEIT_TOLERANCE);
    }
    
//  kelvinToCelsius
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void kelvinToCelsius(double celsius, double fahrenheit, double kelvin) {
	assertEquals(kelvin, TeperatureConverter.celiusToFahrenheit(celsius), KELVIN_TOLERANCE);
    }
    
//  fahrenheitToKelvin
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void fahrenheitToKelvin(double celsius, double fahrenheit, double kelvin) {
	assertEquals(fahrenheit, TeperatureConverter.fahrenheitToKelvin(kelvin), KELVIN_TOLERANCE);
    }

//  fahrenheitToCelcius
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void fahrenheitToCelcius(double celsius, double fahrenheit, double kelvin) {
	assertEquals(fahrenheit, TeperatureConverter.kelvinToFahrenheit(celsius), FAHRENHEIT_TOLERANCE);
    }

 
    
    
    
}