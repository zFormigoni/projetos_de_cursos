package datas;
import java.text.ParseException;


public class AulaDatas {

    public static void main(String[] args) throws ParseException, InterruptedException {

/*                       IMPORTAÇÕES (IMPORTAR PARA EVITAR ERROS)
import java.util.Calendar;
import java.util.Date;
import javax.sound.midi.SysexMessage;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

*/


/*                       INICIAÇÃO DO DATE
Date date = new Date(); 
SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
Calendar calendar = Calendar.getInstance();
*/
/*                       USO DO DATE  
                                                                                                       
        System.out.println("data em milisegundos: " + date.getTime());
        System.out.println("dia da semana: " + date.getDay());
        System.out.println("mês: " + date.getMonth());
        System.out.println("ano: " + (date.getYear() + 1900));
        System.out.println("hora do dia: " + date.getHours());
        System.out.println("minutos: " + date.getMinutes());
        System.out.println("segundos: " + date.getSeconds());

        SimpleDateFormat = new SimpleDateFormat("dd/MM/yyyyy");
        System.out.println("formato padrao de data: " + SimpleDateFormat.format(date));
        
        SimpleDateFormat = new SimpleDateFormat("hh:mm.ss");
        System.out.println("formato de horas: " + SimpleDateFormat.format(date));
//esse formtao pode ser inserido junto com os formatos de data (yyyy/MM/dd mm:hh.ss)

        SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("formato de banco de dados: " + SimpleDateFormat.format(date));
//passar formato de data 
        SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("objeto date: " + SimpleDateFormat.parse("2021-11-20"));
*/
/*                       USO DO CALENDAR

        System.out.println("calendar dia da semana: "+ calendar.get(calendar.DAY_OF_WEEK));
        System.out.println("calendar dia do mes: "+ calendar.get(calendar.DAY_OF_MONTH));
        System.out.println("calendar dia do ano: "+ calendar.get(calendar.DAY_OF_YEAR));
        System.out.println("calendar mes: "+ calendar.get(calendar.MONTH));

        SimpleDateFormat = new SimpleDateFormat("dd/MM/aaaa MM:hh.ss");
        System.out.println("data usando o calendar: " + SimpleDateFormat.format(calendar.getTime()));
        
        SimpleDateFormat = new SimpleDateFormat("dd MM aaaa MM hh ss");
        System.out.println("data usando o calendar: " + SimpleDateFormat.format(calendar.getTime()));
*/        
/*                       COMPARAÇÃO DE DATAS 
       
        Date dataVencimento     = SimpleDateFormat.parse("10/10/2021"); 
        Date dataAtual          = SimpleDateFormat.parse("10/09/2021");

//posterior, maior, depois 
        if (dataVencimento.after(dataAtual)){       
            System.out.println(SimpleDateFormat.format(dataVencimento) + " Vem depois de " + SimpleDateFormat.format(dataAtual)); 
        }else{
            System.out.println(SimpleDateFormat.format(dataVencimento) + " Vem antes de " + SimpleDateFormat.format(dataAtual));
        }

// anterior, antes, menor 
        if (dataAtual.before(dataVencimento)){
            System.out.println(SimpleDateFormat.format(dataVencimento) + " Vem depois de " + SimpleDateFormat.format(dataAtual)); 
        }else{
            System.out.println(SimpleDateFormat.format(dataVencimento) + " Vem antes de " + SimpleDateFormat.format(dataAtual));
        }
*/
/*                       SOMA DE DATAS
        
        calendar.setTime(SimpleDateFormat.parse("20/10/2021"));                                 
        //Inserindo datas manualmente
        
        calendar.add(calendar.DAY_OF_MONTH, 5);
        System.out.println("data (20/10/2021) + 5 dias: " + SimpleDateFormat.format(calendar.getTime()));
        calendar.add(calendar.DAY_OF_MONTH, -5);

        calendar.add(calendar.MONTH, 2);
        System.out.println("data (20/10/2021) + 2 meses: " + SimpleDateFormat.format(calendar.getTime()));
        calendar.add(calendar.MONTH, -2);

        calendar.add(calendar.YEAR, 30);
        System.out.println("data (20/10/2021) + 30 anos: " + SimpleDateFormat.format(calendar.getTime()));
        calendar.add(calendar.YEAR, -30);
*/
/*                       CHRONOUNIT

        SimpleDateFormat.format(calendar.getTime());

        Long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-01-01"), LocalDate.now());
        long mes = ChronoUnit.MONTHS.between(LocalDate.parse("2021-01-01"),LocalDate.parse("2021-10-20"));
        
        System.out.println("passaram-se " + dias + " dias completos de 01/01/2021 ate hoje");
        System.out.println("passaram-se " + mes + " meses completos de 01/01/2021 ate hoje");
*/
/*                       GERANDO PARCELAS
        
        calendar.setTime(SimpleDateFormat.parse("20/01/2020"));
        int parcelas = 10;                                              // poderia ser introduzido a entrada de valor pelo usuario
        for (int mes = 0; mes < parcelas; mes ++ ){

                System.out.println("Parcela "+ (mes + 1) + ": dia: " + SimpleDateFormat.format(calendar.getTime()));
                calendar.add(calendar.MONTH, 1);
                
        }
*/
/*                       NOVA API DATA (LocalDate) 
        LocalDate dataAtual =  LocalDate.now();
        System.out.println((dataAtual));                

        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);                  

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Dia da semana: " + dataHoraAtual.getDayOfWeek());
        System.out.println("Dia do mes: " + dataHoraAtual.getDayOfMonth());
        System.out.println("Dia do ano: " + dataHoraAtual.getDayOfYear());
        System.out.println("nome do mes: " + dataHoraAtual.getMonth());
        System.out.println("mes: " + dataHoraAtual.getMonthValue());
        System.out.println("ano: " + dataHoraAtual.getYear());
*/
/*                       FORMATAÇÃO DA NOVA API 

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data: " + dataHoraAtual.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Hora: " + dataHoraAtual.format(DateTimeFormatter.ISO_TIME));
        System.out.println("Data e hora: " + dataHoraAtual.format(DateTimeFormatter.ISO_DATE_TIME));

        //desse jeito nao é necessario usar o SimpleDateFormat, basta passar o formato com "DateTimeFormatter.ofPattern( formato )"
        System.out.println("Data formatada: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Hora formatada: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
*/
/*                       INSTANT

        Instant iInicio = Instant.now();

        Thread.sleep(2_000);

        Instant iFinal = Instant.now();

        Duration duração = Duration.between(iInicio,iFinal);

        System.out.println("Duração em nanosegundos: " + duração.toNanos());
        System.out.println("Duração em segundos: " + duração.toSeconds());
        System.out.println("Duração em milisegundos: " + duração.toMillis());
        System.out.println("Duração em minutos: " + duração.toMinutes());
*/
/*                       PERIOD

        LocalDate data1 = LocalDate.of(2020, 01, 20);            // ano, mes, e dia
        LocalDate data2 = LocalDate.of(2021, 10, 26);           // data maior, que vem depois 

        System.out.println("data1 é maior que data2: " + data1.isAfter(data1));
        System.out.println("data1 é menor que data2: " + data1.isBefore(data2));

        Period periodo = Period.between(data1,data2);

        System.out.println("total de meses: " + periodo.toTotalMonths());
        System.out.println("o periodo entre " + data1.format(DateTimeFormatter.ISO_DATE) + " e " + data2.format(DateTimeFormatter.ISO_DATE) +
        " é de: \n" + periodo.getYears() + " anos " + periodo.getMonths() +" meses "+ periodo.getDays() + " dias.");
*/
/*                       SOMA DE DATAS NOVA API
        LocalDate data = LocalDate.of(2000, 01, 01);

//dessa forma a soma sera aplicada para a "data" passada originalmente, entao cada soma sera feita em cima da data original 
        System.out.println("data mais 5 dias............" + data.plusDays(5));
        System.out.println("data mais 5 semanas........." + data.plusWeeks(5));
        System.out.println("data mais 5 meses..........." + data.plusMonths(5));
        System.out.println("data mais 5 anos............" + data.plusYears(5));

//dessa forma a soma sera aplicada para a "data" original esta recebendo cada alteração feita
        System.out.println("data mais 5 dias............" + (data = data.plusDays(5)));
        System.out.println("data mais 5 semanas........." + (data = data.plusWeeks(5)));
        System.out.println("data mais 5 meses..........." + (data = data.plusMonths(5)));
        System.out.println("data mais 5 anos............" + (data = data.plusYears(5)));
*/
/*                       SUBTRAÇÃO DE DATAS NOVA API 

LocalDate data = LocalDate.of(2000, 01, 01);

//dessa forma a subtração sera aplicada para a "data" passada originalmente, entao cada soma sera feita em cima da data original 
        System.out.println("data menos 5 dias............" + data.minusDays(15));
        System.out.println("data menos 5 semanas........." + data.minusWeeks(15));
        System.out.println("data menos 5 meses..........." + data.minusMonths(15));
        System.out.println("data menos 5 anos............" + data.minusYears(15));

//dessa forma a subtração sera aplicada para a "data" original esta recebendo cada alteração feita
        System.out.println("data menos 5 dias............" + (data = data.minusDays(15)));
        System.out.println("data menos 5 semanas........." + (data = data.minusWeeks(15)));
        System.out.println("data menos 5 meses..........." + (data = data.minusMonths(15)));
        System.out.println("data menos 5 anos............" + (data = data.minusYears(15)));
*/
/*                       GERANDO PARCELAS NOVA API

        LocalDate data = LocalDate.parse("2021-10-10");

        for (int mes = 0; mes < 12; mes ++){
                System.out.println("parcela " + (mes + 1) + ": " + (data = data.plusMonths(1)));
        }
*/

    }      
}
