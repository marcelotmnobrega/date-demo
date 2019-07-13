package com.example.datedemo.app;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class AdvancedLocalDateTimeTest implements WithAssertions {

    ZoneId SP_ZONE = ZoneId.of("America/Sao_Paulo");
    ZoneId NY_ZONE = ZoneId.of("America/New_York");
    ZoneId LONDON_ZONE = ZoneId.of("Europe/London");
    ZoneId UTC = ZoneId.of("UTC");

//  str (utc) >> LocalDate (sp)
//  LocalDate (sp) >> str (utc)

    @Test
    void test01() {
        {
            System.out.println("---------------");
            System.out.println("SAO PAULO");
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE));
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE).withZoneSameInstant(ZoneId.of("UTC")));
        }

        {
            System.out.println("---------------");
            System.out.println("NEW YORK");
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE));
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE).withZoneSameInstant(ZoneId.of("UTC")));
        }

        {
            System.out.println("---------------");
            System.out.println("LONDON");
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE));
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE).withZoneSameInstant(ZoneId.of("UTC")));
        }
    }

    @Test
    void test02() {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
        {
            System.out.println("---------------");
            System.out.println("SAO PAULO");
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE));
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE).withZoneSameInstant(ZoneId.of("UTC")));
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE).withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(SP_ZONE).withZoneSameInstant(ZoneId.of("UTC")).format(formatter));
        }

        {
            System.out.println("---------------");
            System.out.println("NEW YORK");
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE));
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE).withZoneSameInstant(ZoneId.of("UTC")));
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE).withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(NY_ZONE).withZoneSameInstant(ZoneId.of("UTC")).format(formatter));
        }

        {
            System.out.println("---------------");
            System.out.println("LONDON");
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE));
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE).withZoneSameInstant(ZoneId.of("UTC")));
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE).withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime());
            System.out.println(LocalDate.now().atStartOfDay(LONDON_ZONE).withZoneSameInstant(ZoneId.of("UTC")).format(formatter));
        }
    }

    @Test
    void testUtcStrToSaoPauloLocalDateTime() {
        {
            System.out.println("--------------- testUtcStrToSaoPauloLocalDateTime()");
            String utcStr = "2019-07-13T12:13:14.12Z";
            ZonedDateTime zdt = Instant.parse(utcStr).atZone(SP_ZONE);
            LocalDateTime ldt = zdt.toLocalDateTime();
            System.out.println(zdt);
            System.out.println(ldt);
            System.out.println(ldt.truncatedTo(ChronoUnit.MILLIS));
        }
        {
            System.out.println("---------------");
            String utcStr = "2019-07-13T12:13:14.9876543Z";
            ZonedDateTime zdt = Instant.parse(utcStr).atZone(SP_ZONE);
            LocalDateTime ldt = zdt.toLocalDateTime();
            System.out.println(zdt);
            System.out.println(ldt);
            System.out.println(ldt.truncatedTo(ChronoUnit.MILLIS));
        }
    }

    @Test
    void testUtcStrToSaoPauloDLSLocalDateTime() {
        {
            System.out.println("--------------- testUtcStrToSaoPauloDLSLocalDateTime()");
            String utcStr = "2018-12-13T12:13:00Z";
            ZonedDateTime zdt = Instant.parse(utcStr).atZone(SP_ZONE);
            LocalDateTime ldt = zdt.toLocalDateTime();
            System.out.println(zdt);
            System.out.println(ldt);
            System.out.println(ldt.truncatedTo(ChronoUnit.MILLIS));
        }
        {
            System.out.println("--------------- testUtcStrToSaoPauloDLSLocalDateTime()");
            String utcStr = "2018-12-13T12:13:14Z";
            ZonedDateTime zdt = Instant.parse(utcStr).atZone(SP_ZONE);
            LocalDateTime ldt = zdt.toLocalDateTime();
            System.out.println(zdt);
            System.out.println(ldt);
            System.out.println(ldt.truncatedTo(ChronoUnit.MILLIS));
        }
        {
            System.out.println("--------------- testUtcStrToSaoPauloDLSLocalDateTime()");
            String utcStr = "2018-12-13T12:13:14.12Z";
            ZonedDateTime zdt = Instant.parse(utcStr).atZone(SP_ZONE);
            LocalDateTime ldt = zdt.toLocalDateTime();
            System.out.println(zdt);
            System.out.println(ldt);
            System.out.println(ldt.truncatedTo(ChronoUnit.MILLIS));
        }
        {
            System.out.println("---------------");
            String utcStr = "2018-12-13T12:13:14.9876543Z";
            ZonedDateTime zdt = Instant.parse(utcStr).atZone(SP_ZONE);
            LocalDateTime ldt = zdt.toLocalDateTime();
            System.out.println(zdt);
            System.out.println(ldt);
            System.out.println(ldt.truncatedTo(ChronoUnit.MILLIS));
        }
    }

    @Test
    void testSaoPauloLocalDateTimeToUtcStr() {
        {
            System.out.println("--------------- testSaoPauloLocalDateTimeToUtcStr()");
            LocalDateTime ldt = LocalDateTime.of(2019, Month.JULY, 13,12,30, 45, 987_654_321);
            ZonedDateTime zonedDT = ZonedDateTime.of(ldt, SP_ZONE);
            ZonedDateTime zonedUTC = zonedDT.withZoneSameInstant(UTC);
            System.out.println(zonedUTC.format(DateTimeFormatter.ISO_INSTANT));
            System.out.println(zonedUTC.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")));
            System.out.println(zonedUTC.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
            System.out.println(zonedUTC.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        }
        {
            System.out.println("--------------- testSaoPauloLocalDateTimeToUtcStr()");
            LocalDateTime ldt = LocalDateTime.of(2018, Month.DECEMBER, 13,12,30, 45, 987_654_321);
            ZonedDateTime zonedDT = ZonedDateTime.of(ldt, SP_ZONE);
            ZonedDateTime zonedUTC = zonedDT.withZoneSameInstant(UTC);
            System.out.println(zonedUTC.format(DateTimeFormatter.ISO_INSTANT));
            System.out.println(zonedUTC.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")));
            System.out.println(zonedUTC.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
            System.out.println(zonedUTC.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        }
    }



}
