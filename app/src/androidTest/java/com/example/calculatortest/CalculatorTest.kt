package com.example.calculatortest

import org.jetbrains.annotations.TestOnly
import org.junit.Test

class CalculatorTest {
    var calculator = Calculator();

    @Test
    fun testAddSuccess(){
        var result = calculator.add(10,10);
    }
}