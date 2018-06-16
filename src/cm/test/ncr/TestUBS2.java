package cm.test.ncr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestUBS2 {

	public static void main(String[] args) {
		List<String> a = Arrays.asList("a", "b", "c", "a");

		Set s1 = new HashSet<>(a);
		Set s2 = new TreeSet<>(a);

		System.out.println(s1.equals(s2));

		System.out.println(
				Arrays.stream(new int[] { 1, 2, 3, 4 }).map(n -> n * 3 + 1).filter(i -> i > 10).average().isPresent());

		CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<>();

		c.add("a");
		c.add("b");
		c.add("c");

		Iterator<String> it = c.iterator();
		c.remove("b");
		for (Iterator iterator = it; iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

}
