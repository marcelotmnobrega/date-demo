package com.example.datedemo.app;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;

public class BasicInstantTest implements WithAssertions {

    @Test
    void testBasic01() throws InterruptedException {
        Instant instant1 = Instant.now();
        Thread.sleep(1);
        Instant instant2 = Instant.now();
        assertThat(instant1).isBefore(instant2);
    }

    @Test
    void testBasic02() throws InterruptedException {
        Clock clock = Clock.systemUTC();
        Instant instant1 = Instant.now(clock);
        Thread.sleep(1);
        Instant instant2 = Instant.now(clock);
        assertThat(instant1).isBefore(instant2);
    }


    //Period is date based (1d, 1mo, etc)
    //Duration is time based (translatted to nano-secs internally), so they may vary depending on daylight savings, etc

}
