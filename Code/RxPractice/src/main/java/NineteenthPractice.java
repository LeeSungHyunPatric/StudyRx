import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class NineteenthPractice {
	public static void main (String[] args) {
		Function<String, Observable<String>> fc = 
				ball -> Observable.just(ball+"b", ball+"a");
		
		Observable.just("hi", "Hello", "bye", "goodNight")
		.flatMap(fc)
		.subscribe(System.out::println);
	}
}
