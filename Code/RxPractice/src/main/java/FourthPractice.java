import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class FourthPractice {
	public static void main (String[] args) {
		Observable ob = Observable.create((ObservableEmitter<Integer> oe) -> {
			oe.onNext(100);
			oe.onNext(200);
			oe.onNext(200);
			oe.onComplete();
		});
		
		ob.subscribe(System.out::println);
	}
}
