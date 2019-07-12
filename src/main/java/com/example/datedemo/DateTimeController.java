package com.example.datedemo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;

@RestController
public class DateTimeController {
    //private Clock clock = Clock.fixed(Instant.parse("2019-02-05T16:45:42.01Z"), ZoneId.of("Australia/Sydney"));

    @GetMapping("/time")
    public DateTimeDto timeMapping() {
        return new DateTimeDto();
//        return new DateTimeDto(clock);
    }
}


class DateTimeDto {

    private LocalDate localDate;
    private ZonedDateTime localDateTime1;
    private LocalDateTime localDateTime2;
    private OffsetDateTime localDateTime3;
    private LocalTime localTime;

    public DateTimeDto(Clock clock) {
        localDate = LocalDate.now(clock);
        localDateTime1 = ZonedDateTime.now(clock);
        localDateTime2 = LocalDateTime.now(clock);
        localDateTime3 = OffsetDateTime.now(clock);
        localTime = LocalTime.now(clock);
    }

    public DateTimeDto() {
        localDate = LocalDate.now();
        localDateTime1 = ZonedDateTime.now();
        localDateTime2 = LocalDateTime.now();
        localDateTime3 = OffsetDateTime.now();
        localTime = LocalTime.now();
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
    public ZonedDateTime getLocalDateTime1() {
        return localDateTime1;
    }

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
    public LocalDateTime getLocalDateTime2() {
        return localDateTime2;
    }

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
    public OffsetDateTime getLocalDateTime3() {
        return localDateTime3;
    }
    public LocalTime getLocalTime() {
        return localTime;
    }
}