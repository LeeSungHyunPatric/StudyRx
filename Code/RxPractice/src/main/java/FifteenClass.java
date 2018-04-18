import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;

//2018 4 17 replySubject�� ���� ������ subjectŬ�����̴�. ��� ���� ���� ������ó�� �����س��� 
//�ٽ� ��� �����ڿ��� �����ش�.

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
