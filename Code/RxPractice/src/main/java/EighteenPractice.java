import io.reactivex.functions.*;
import io.reactivex.Observable;

// 2018 4 18 practice the mapping and method chaining

public class EighteenPractice {
	public static void main (String[] args) {
		Function<String, String> fc = st -> st + "hi";
		
		String[] ball = {"1", "2", "3", "4", "5"};
		Observable.fromArray(ball)
		.map(fc)
		.subscribe(System.out::println);
	}
}
