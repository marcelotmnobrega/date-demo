package com.example.datedemo.app;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.next;

class BasicLocalDateTest implements WithAssertions {

    @Test
    void testBasic01() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2019, Month.JULY, 12);

        assertThat(localDate1).isAfter(localDate2);
        assertThat(String.valueOf(localDate2)).isEqualTo("2019-07-12");
        assertThat(localDate2.toString()).isEqualTo("2019-07-12");
        assertThat(localDate2.isLeapYear()).isFalse();
        assertThat(localDate2.lengthOfMonth()).isEqualTo(31);
    }

    @Test
    void testBasic02() {

        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusMonths(3).minusDays(1);
        localDate = localDate.withDayOfMonth(1);
        localDate = localDate.with(Month.OCTOBER);
        localDate = localDate.withYear(2019);

        assertThat(localDate).isEqualTo(LocalDate.of(2019, Month.OCTOBER, 1));
    }

    @Test
    void testBasic03() {
        LocalDate localDate = LocalDate.of(2019, Month.JULY, 12);
        localDate = localDate.with(lastDayOfMonth());
        localDate = localDate.with(next(TUESDAY));
        LocalDate localDate2 = localDate.plusDays(1);
        assertThat(localDate2.getDayOfWeek()).isEqualTo(WEDNESDAY);
    }
}
