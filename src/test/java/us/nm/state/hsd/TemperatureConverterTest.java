package us.nm.state.hsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TemperatureConverterTest {
    @Test
    void celsiusToFahrenheit() {
	assertEquals(212,TeperatureConverter.celiusToFahrenheit(100));
    }
}
