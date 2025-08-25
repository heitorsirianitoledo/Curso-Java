import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.time.Instant;


public class DataHora {
   public static void main(String[]args){
    
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    
    LocalDate d1 = LocalDate.now();
    LocalDateTime d2 = LocalDateTime.now();
    Instant d3 = Instant.now();
    LocalDate d4 = LocalDate.parse("2025-08-20");
    LocalDateTime d5 = LocalDateTime.parse("2025-08-20T15:38:19");
    Instant d6 = Instant.parse("2025-08-20T15:38:19Z");
    Instant d7 = Instant.parse("2025-08-20T15:38:19-03:00");
    LocalDate d8 = LocalDate.parse("20/08/2025",fmt1);
    LocalDate d9 = LocalDate.of(2089, 8, 12);
    LocalDateTime d10 = LocalDateTime.ofInstant(d6,ZoneId.systemDefault());
    LocalDateTime d11 = LocalDateTime.ofInstant(d6,ZoneId.of("Portugal"));
    LocalDateTime nextWeek = d5.plusDays(7);
    Instant nextWeekInstant = d6.plus(7, ChronoUnit.DAYS);
    Duration t1 = Duration.between(d5, nextWeek);
    Duration t2 = Duration.between(d4.atStartOfDay(), nextWeek);
    

    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
    System.out.println(d5);
    System.out.println(d6);
    System.out.println(d7);
    System.out.println(d9);
    System.out.println(d9.format(fmt1));
    System.out.println(fmt2.format(d6));
    System.out.println(d10);
    System.out.println(d11);
    System.out.println("d4 = " + d4.getDayOfMonth());
    System.out.println(nextWeek);
    System.out.println(nextWeekInstant);
    System.out.println(t1.toDays());
    System.out.println(t2.toDays());


   }
} 