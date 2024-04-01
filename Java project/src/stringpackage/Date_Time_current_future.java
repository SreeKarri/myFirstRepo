package stringpackage;

import java.util.Date;

public class Date_Time_current_future {

	public static void main(String[] args) {

		Date d1 = new Date();
		// getTime(); //method
		System.out.println("Machine time: " + d1.getTime()); // Machine time

		Date d2 = new Date(d1.getTime());
		System.out.println("Human understadable current time: " + d2);

		String d3 = d2.toString(); // d3=current time

		// d4 is future time//
		Date d4 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 10));
		System.out.println("Future date in 10days: "+d4); // output future date in 10days

		//Date d5 = new Date(d1.getTime() - (1000 * 60 * 60 * 24 * 10));
		//System.out.println(d5); // 10 days past time
		String s = d3.toString();
		String month = d3.substring(4, 7);
		System.out.println(month);
		String date = d3.substring(8, 10);
		System.out.println(date);
		String year = d3.substring(d3.length() - 4);
		System.out.println(year);
		System.out.println(month.concat("/").concat(date).concat("/").concat(year));

	}

}
