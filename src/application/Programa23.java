package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa23 {
    public static void main(String[] args) {
        /* Fazer cálculos com datas e horas */

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        /* Não é possivel calcular o tempo de duração entre dois LocalDate, é preciso fazer um conversão */
        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());

        Duration t3 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t4 = Duration.between(pastWeekInstant, d03);
        Duration t5 = Duration.between(d03, pastWeekInstant);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());
        System.out.println(t5.toDays());
    }
}
