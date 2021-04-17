package com.example.javatokotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KotlinDemoTest {
    val kotlinDemo = KotlinDemo()

    @Test
    fun `should test given test`() {
        val age = kotlinDemo.accessProperties()

        assertEquals(null, age)
    }
}
