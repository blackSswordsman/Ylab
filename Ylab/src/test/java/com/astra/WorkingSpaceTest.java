package com.astra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WorkingSpaceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFreeSpace() {
        var sut = new WorkingSpace() {
        };
        int freeSpace = sut.getFreeSpace();
        assertThat(freeSpace).isEqualTo(1);
    }
}