import java.util.stream.IntStream;

import io.reactivex.Observable;

public class FifthPractice {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5}; // why can't find the toIntgerArray
		
		Observable.fromArray(toIntgerArray(arr)).subscribe(System.out::println);
	}
	
	public static Integer[] toIntgerArray (int[] integer) {
		return IntStream.of(integer).boxed().toArray(Integer[]::new);
	}
}
