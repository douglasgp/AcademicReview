package br.com.review.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteComparaData {
	public static void main(String[] args) throws Exception {

		String dataAula[] = { "11/02/2019", "18/02/2019", "18/06/2019" };
		Calendar calendar[] = { new GregorianCalendar(2019, 01, 11), new GregorianCalendar(2019, 02, 18),
				new GregorianCalendar(2019, 05, 18) };

		Calendar today = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Hoje: " + new java.sql.Date(today.getTimeInMillis()));

		for (int i = 0; i < dataAula.length; i++) {
			today.setTime(sdf.parse(dataAula[i]));
			System.out.println(" = = = ");
			System.out.println((i + 1) + "º teste: " + new java.sql.Date(calendar[i].getTimeInMillis()));
		}

		for (int i = 0; i < dataAula.length; i++) {
			if (today.getTimeInMillis() == calendar[i].getTimeInMillis()) {
				System.out.println((i + 1) + "º revisão!");
			} else if (today.getTimeInMillis() == calendar[i].getTimeInMillis()) {
				System.out.println((i + 1) + "º revisão!");
			} else if (today.getTimeInMillis() == calendar[i].getTimeInMillis()) {
				System.out.println((i + 1) + "º revisão!");
			}
		}
	}

}
