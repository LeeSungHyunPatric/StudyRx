import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;

//2018 4 17 replySubject는 가장 기이한 subject클래스이다. 모든 것을 비디오 테이프처럼 저장해놓고 
//다시 모든 구독자에게 보내준다.

public class FifteenClass {
	public static void main (String[] args) {
		ReplaySubject<String> ps = ReplaySubject.create();
		ps.subscribe(System.out::println);
		ps.onNext("Hello World");
		ps.onNext("Hi");
		ps.onNext("Hola");
		ps.subscribe(System.out::println);
		ps.onNext("bye");
		ps.onNext("good night");	
	}
}
