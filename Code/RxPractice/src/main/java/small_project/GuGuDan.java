package small_project;

import java.util.Scanner;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class GuGuDan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		Function<Integer, Observable<Integer>> fc = num -> {
				Observable<Integer> ob = Observable.range(1, 9)
						.map(it -> it*num);
				return ob;
		};
		
			Observable.range(1, 9)
			.flatMap(fc)
			.subscribe(System.out::println);
	}
}
