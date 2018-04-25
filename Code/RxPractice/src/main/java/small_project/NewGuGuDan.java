package small_project; 
import java.util.Scanner;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class NewGuGuDan {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer dan = scanner.nextInt();
		
		Function<Integer, Observable<String>> fc = num -> {
			return Observable.range(1, 9)
			.map(it -> num+" * "+it+" = "+num*it);
		};
		
		Observable.just(dan)
		.flatMap(fc);
	}
}
