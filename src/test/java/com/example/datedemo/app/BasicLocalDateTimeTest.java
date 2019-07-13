package com.example.datedemo.app;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class BasicLocalDateTimeTest implements WithAssertions {

    @Test
    void testBasic01() {
        LocalDateTime ldt = LocalDateTime.now();
        ldt = ldt.plusHours(3).minusMinutes(5);
        ldt = ldt.withNano(987_654_321);
        ldt = ldt.truncatedTo(ChronoUnit.MILLIS);
        assertThat(ldt.getNano()).isEqualTo(987_000_000);
    }


}
