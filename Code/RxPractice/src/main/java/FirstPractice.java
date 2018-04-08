import io.reactivex.*;

public class FirstPractice {

	public void enit() {
		Observable.just("Hello Rxjava")
		.subscribe(System.out::println);
	}
	
	public static void main (String[] args) {
		FirstPractice firstPractice = new FirstPractice();
		firstPractice.enit();
	}
}
