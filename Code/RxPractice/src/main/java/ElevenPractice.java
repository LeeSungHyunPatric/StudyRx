import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.Subject;

// 2018 4 17 subject�� �̿��� �߰ſ� �������� ���� �׸��� subject�� �������� �޼ҵ带 �̿��ؼ� 
// ����ϴ� ���
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
		
		// ??�� �������� �����ϰ� ���� ???? ,,,,
		AsyncSubject<String> as = AsyncSubject.create(); // subscribe�� ��������
		asyncSubject.subscribe(data -> System.out.println(data));
		
		Observable<String> ob = Observable.fromArray(hello);
		ob.subscribe(as);
	}
}
