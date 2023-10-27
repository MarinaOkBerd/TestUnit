package org.example;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {
    Numbers numbers;

    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @Test
    @DisplayName("Проверка метода evenOddNumber.")
    void evenOddNumberTest() {
        assertThat(numbers.evenOddNumber(2)).isEqualTo(true);
        assertThat(numbers.evenOddNumber(3)).isEqualTo(false);
        
    }

    @Test
    @DisplayName("Проверка метода numberInInterval.")
    void numberInIntervalTest() {
        assertThat(numbers.numberInInterval(25)).isEqualTo(true);
        assertThat(numbers.numberInInterval(100)).isEqualTo(true);
        assertThat(numbers.numberInInterval(99)).isEqualTo(true);
        assertThat(numbers.numberInInterval(24)).isEqualTo(false);
        assertThat(numbers.numberInInterval(101)).isEqualTo(false);
    }
}
