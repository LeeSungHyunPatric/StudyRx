import io.reactivex.*;

public class SecondPractice {

	public void print () {
		Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
		.subscribe(System.out::println);
	}
	
	public static void main (String[] args) {
		SecondPractice sp = new SecondPractice();
		sp.print();
	}
}
