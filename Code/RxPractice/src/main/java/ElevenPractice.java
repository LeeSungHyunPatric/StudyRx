import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.Subject;

// 2018 4 17 subject를 이용한 뜨거운 옵저버블 생성 그리고 subject의 여러가지 메소드를 이용해서 
// 사용하는 방법
public class ElevenPractice {
	public static void main(String[] args) {
		AsyncSubject<String> asyncSubject = AsyncSubject.create();
		asyncSubject.onNext("Hello");
		asyncSubject.onNext("HI");
		asyncSubject.onNext("Hola");
		asyncSubject.subscribe(System.out::println);
		asyncSubject.onNext("Bye");
		asyncSubject.onNext("Adios");
		asyncSubject.subscribe(System.out::println);
		asyncSubject.onComplete();
		
		String[] hello = {"a", "b", "c", "d"}; 
		
		// ??왜 위에것을 구독하게 되지 ???? ,,,,
		AsyncSubject<String> as = AsyncSubject.create(); // subscribe를 생성가능
		asyncSubject.subscribe(data -> System.out.println(data));
		
		Observable<String> ob = Observable.fromArray(hello);
		ob.subscribe(as);
	}
}
