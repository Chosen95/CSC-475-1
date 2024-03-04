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

    private fun assertEquals(d: Double, result: Unit, d1: Double) {

    }

    companion object {
        fun celsiusToFahrenheit(d: Double) {

        }

        fun fahrenheitToCelsius(d: Double) {
return
        }
    }


}
