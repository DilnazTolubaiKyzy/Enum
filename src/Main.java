import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        Week week = Week.valueOf(w.toUpperCase());
        switch (week){
            case MONDAY  -> System.out.println(week.getName()+" - куну техникалык 1 сабак болот");
            case TUESDAY -> System.out.println(week.getName()+" - куну практикалык жана английский сабактар болот");
            case WEDNESDAY -> System.out.println(week.getName()+" - куну техникалык 2 сабак  болот");
            case THURSDAY -> System.out.println(week.getName()+" - куну практикалык жана SoftSkills сабактар болот");
            case FRIDAY -> System.out.println(week.getName()+" - куну техникалык 3 сабак болот");
            case SUNDAY -> System.out.println(week.getName()+" - куну практикалык  сабак болот");
            case SATURDAY -> System.out.println(week.getName()+" - куну дем алыш");
        }

    }
}