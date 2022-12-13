package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun generates_number () {
        val result = Dice(6).roll()
        assertTrue("The value of rollResult was not between 1 and 6", result in 1..6)
    }
}