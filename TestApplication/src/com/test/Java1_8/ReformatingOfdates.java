package com.test.Java1_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

public class ReformatingOfdates {

	public static void main(String args[]) throws ParseException {

		String[] array = { "20th jan 2014", "20th jan 2014", "20th jan 2014" };

		String sDate1 = "20-JAN-2014";
		Date date1 = new SimpleDateFormat("dd-MMM-yyyy").parse(sDate1);
		System.out.println(sDate1 + "\t" + date1);

		System.out.println(new SimpleDateFormat("YYYY-MM-DD").format(date1));

		// //Arrays.stream
		// Stream<String> stream1 = Arrays.stream(array);
		// @SuppressWarnings("rawtypes")
		// List arrayList = stream1.forEach(x -> System.out.println(x.replace(" ",
		// "-")));

		Object[] array1 = Arrays.stream(array).map(n -> n.replace(" ", "-").replace("th", "").toUpperCase()).toArray();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat formatter1 = new SimpleDateFormat("YYYY-MM-DD");
		Object[] array2 = Arrays.stream(array1).map(n -> {
			try {
				return formatter1.format(formatter.parse(n.toString()));

				// DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(ldt)
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return null;
		}).toArray();

		String stringArray[] = Arrays.stream(array2).toArray(String[]::new);

		Stream<String> stream1 = Arrays.stream(stringArray);

		// @SuppressWarnings("rawtypes")
		stream1.forEach(x -> {
			try {
				// System.out.println(formatter.format(formatter.parse(x)));;

				System.out.println(x);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

}