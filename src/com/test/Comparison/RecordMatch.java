package com.test.Comparison;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RecordMatch {

	public static class FirstNameComparator implements Comparator<Record> {

		@Override
		public int compare(Record o1, Record o2) {
			return o1.fName.compareTo(o2.fName);
		}

	}

	public static class Record implements Comparable<Record> {

		int recordNo;
		String fName;
		String lname;

		public Record(int recordNo, String fName, String lname) {
			super();
			this.recordNo = recordNo;
			this.fName = fName;
			this.lname = lname;
		}

		@Override
		public String toString() {
			return "Record [recordNo=" + recordNo + ", fName=" + fName + ", lname=" + lname + "]";
		}

		@Override
		public int compareTo(Record o) {
			// TODO Auto-generated method stub
			return this.recordNo - o.recordNo;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Record> rlist = Arrays.asList(new Record(10, "Sagar", "Pisal"), new Record(20, "Shailesh", "Pisal"),
				new Record(30, "Sam", "Somase"), new Record(40, "Sagar", "Peter"), new Record(50, "Peter", "Berg"));

		search(rlist, "Sagar Pisal");

		Collections.sort(rlist);
		System.out.println("Natural ordering");
		for (Record record : rlist) {
			System.out.println(record.toString());
		}

		System.out.println("Explicit ordering");

		Collections.sort(rlist, new FirstNameComparator());
		for (Record record : rlist) {
			System.out.println(record.toString());
		}
	}

	private static void search(List<Record> rlist, String searchString) {
		String[] str = searchString.split(" ");
		System.out.println("inside");
		for (Record record : rlist) {
			// System.out.println(record.fName.concat(record.lname) + "--" +
			// str[0]+"--"+str[1]);
			if (record.fName.equals(str[0]) || record.lname.equals(str[1]) || record.fName.equals(str[1])
					|| record.lname.equals(str[0])) {

				if (record.fName.equals(str[0]) && record.lname.equals(str[1])) {
					System.out.println("Exact match:" + record.recordNo);
				} else {

					System.out.print(">>" + record.recordNo);
				}
			}
		}
	}

}
