package practica.autoo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author lalor
 */
public class Fechas {
    
    public static void main(String [] args){
        Date fecha = new Date(2019,03,5);
        int diasRenta = 10;
        System.out.println("Fecha -->" + fecha);
        Date now = new Date ();
        System.out.println("Now -->" + now);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, diasRenta);
        Date fechaFinal = calendar.getTime();
        System.out.println("Fecha final -->" + fechaFinal);
        
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR,1);
        Date postDay = calendar.getTime();
        System.out.println("Fecha validar -->" + postDay);
        
        if(fechaFinal.compareTo(postDay) == -1){
            System.out.println("Se entrega mañana");
        }
        
        LocalDate date = LocalDate.of(1989,11,11);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth()); 
        
        LocalTime time = LocalTime.of(5,30,45,35);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
        
        LocalDateTime dateTime = LocalDateTime.of(1989, 11, 11, 5, 30, 45, 35);
        System.out.println(dateTime);
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
        
        LocalDate date2 = LocalDate.of(2016, Month.JULY,18);
        System.out.println(date2);
        LocalDate datePlusOneDay = date2.plus(1, ChronoUnit.DAYS);
        System.out.println(datePlusOneDay);
        
        LocalDate dateNow = LocalDate.parse("2019-04-23");
        LocalDate dateReturn = LocalDate.parse("2019-04-20");
        System.out.println(dateNow.isBefore(dateReturn));
        
        LocalDate fechaActual = LocalDate.now();
        String fechaFormateada = fechaActual.format(DateTimeFormatter.ISO_DATE);
        System.out.println("fechaFormateada" + fechaFormateada);
        
        
    }
}
