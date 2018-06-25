package com.test.immutable;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestCollections  {
	public static class Book {

		private String bookName;
		private int pages;

		public Book(String bookName, int pages) {

			this.bookName = bookName;
			this.pages = pages;

		}

	}

	static List list = new LinkedList();

	public static void main(String[] args) {
		list.add(new Book("Patterns", 12345));
		list.add(new Book("Patterns", 34567));
		list.add(new Book("Examples", 23456));

		testContains();
		testISBNSort();

		try {
			testNaturalSort();
		} catch (Throwable t) {
			System.out.println(t);
		}
	}

	static void testContains() {
		System.out.println("\nTESTING CONTAINS");

		// this is what we're looking for
		Book patterns = new Book("Patterns", 12345);

		// do we have it?
		System.out.println("We have it: " + list.contains(patterns));
	}

	@SuppressWarnings("unchecked")
	static void testISBNSort()  {
		System.out.println("\nTESTING ISBN SORT");

		// sort using a comparator
		Collections.sort(list, new Comparator() {
			public int compare(Object object1, Object object2) {
				Book book1 = (Book) object1;
				Book book2 = (Book) object2;

				return book1.pages - book2.pages;
			}
		});

		// print the collection
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	static void testNaturalSort() {
		System.out.println("\nTESTING NATURAL SORT");

		// sort if we're comparable
		Collections.sort(list);

		// print the collection
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
