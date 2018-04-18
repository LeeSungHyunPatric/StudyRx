import io.reactivex.subjects.PublishSubject;

// 2018 4 17 가장 평범한 패턴이다

public class FourteenPractice {
	public static void main (String[] args) {
		PublishSubject<String> ps = PublishSubject.create();
		ps.subscribe(System.out::println);
	
		ps.onNext("Hello World");
		ps.onNext("Hi");
		ps.onNext("Hola");
		ps.subscribe(System.out::println);
		ps.onNext("bye");
		ps.onNext("good night");	
	}
}
