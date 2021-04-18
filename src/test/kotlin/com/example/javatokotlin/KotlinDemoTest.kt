package com.example.javatokotlin

import io.mockk.every
import io.mockk.mockkStatic
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.mockito.MockedStatic

internal class KotlinDemoTest {
    val kotlinDemo = KotlinDemo()

    @Nested
    inner class WhenAccessProperties {
        @Test
        fun `should return null given XXX`() {
            val age = kotlinDemo.accessProperties()

            assertEquals(null, age)
        }

        @Test
        fun `should return null given NO next car`() {
            mockkStatic("com.example.javatokotlin.PersonKotlinKt")
            every { getNextCarIfPresentKotlin() } returns null

            val age = kotlinDemo.accessProperties()

            assertEquals(null, age)
        }

        @Test
        fun `should return null given didn't record driver's age`() {
            mockkStatic("com.example.javatokotlin.PersonKotlinKt")
            every { getNextCarIfPresentKotlin() } returns CarKotlin(PersonKotlin("Lintao", null))

            val age = kotlinDemo.accessProperties()

            assertEquals(null, age)
        }
    }
}
