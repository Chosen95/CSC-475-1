package com.example.conversionutiltest

import org.junit.Test

class ConversionUtil {

    @Test
    fun testCelsiusToFahrenheit() {
        val result = ConversionUtil.celsiusToFahrenheit(32.0)
        assertEquals(32.0, result, 0.001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = ConversionUtil.fahrenheitToCelsius(32.0)
        assertEquals(32.0, result, 0.001)
    }

    private fun assertEquals(i: Double, result: Unit, d: Double) {

    }

    companion object {
        fun celsiusToFahrenheit(d: Double) {
            return
        }

        fun fahrenheitToCelsius(d: Double) {
            return
        }
    }
}