package Java1_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * 
 * https://dzone.com/articles/a-case-study-different-gc-algorithms-behavior-in-p?fromrel=true
 * 
 * 
 * 1.. No storage. A stream is not a data structure that stores elements; instead, it conveys elements from a source through a pipeline of computational operations.
2. Functional in nature. An operation on a stream produces a result, but does not modify its source.
3. Laziness-seeking. Many stream operations, such as filtering, mapping, or duplicate removal, can be implemented lazily, exposing opportunities for optimization.
4. Possibly unbounded. While collections have a finite size, streams need not.
5. Consumable. The elements of a stream are only visited once during the life of a stream.
 * 
 * 
 * @author User1
 *
 */

public class FlatMap {

	public static void main(String[] args) {

		showFlatMapLists();
		showSort();

		sumWithIntStream();
		showReduceSum();
	}

	public static void showFlatMapLists() {

		List<Integer> numbers1 = Arrays.asList(1, 2, 3);

		List<Integer> numbers2 = Arrays.asList(4, 5, 6);

		Stream.of(numbers1, numbers2) // Stream<List<Integer>>

				.flatMap(List::stream) // Stream<Integer>

				.forEach(System.out::println); // 1 2 3 4 5 6

	}

	public static void showSort() {

		Stream.of(3, 2, 4, 0)

				.sorted((c1, c2) -> c1 - c2)

				.forEach(System.out::println); // 0 2 3 4

	}

	public static void sumWithIntStream() {

		Integer sum = Stream.of(0, 1, 2, 3)

				.mapToInt(num -> num)

				.sum();

	}
	
	public static void showReduceSum() {

	    Integer sum = Stream.of(1, 2, 3)

	        .reduce(0, Integer::sum);



	    System.out.println(sum); // 6

	}

}
