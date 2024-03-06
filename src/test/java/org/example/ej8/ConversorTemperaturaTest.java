package org.example.ej8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @ParameterizedTest
    @ValueSource(doubles = {0, 1, 5, 10, 100})
    public void celsiusAFahrenheit(double celsius) {
        double resultado = (celsius * 9 / 5) + 32;
        assertEquals(resultado, conversor.celsiusAFahrenheit(celsius));
    }

    @ParameterizedTest
    @ValueSource(doubles = {32, 50, 68, 86, 100})
    public void fahrenheitACelsius(double fahrenheit) {
        double resultado = (fahrenheit - 32) * 5 / 9;
        assertEquals(resultado, conversor.fahrenheitACelsius(fahrenheit));
    }
}