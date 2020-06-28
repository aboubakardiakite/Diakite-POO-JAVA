package date;
import date.Date;
import date.util.Month;

public class DateMain {

	public static void  main(String[] args){
		Date date = new Date(17,Month.june,1997);
		System.out.println("aujourd'hui "+date.toString());
		System.out.println("le jour suivant est "+date.tomorrow());
		System.out.println("Dans une semaine on seras le "+date.nDaysLater(7));
		System.out.println("Le nombre de jour entre "+date.toString()+" et "+date.nDaysLater(10)+" est "+(-1*date.differenceInDays(date.nDaysLater(10)))+" jour");
		Date date2 = new Date(20,Month.june,1997);
		if(date.isBefore(date2)){
			System.out.println(date.toString()+" vient avant "+date2.toString());
	}
	if(date2.isAfter(date)){
			System.out.println("Donc "+date2.toString()+" vient après "+date.toString());
	}
}














}
