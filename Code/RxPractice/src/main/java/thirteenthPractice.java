import io.reactivex.subjects.BehaviorSubject;

//2018 4 17 Behavior�� ������ �� ���� ������ ������ ���� �����ϱ� �����Ѵ�

public class thirteenthPractice {
	public static void main(String[] args) {
		BehaviorSubject<String> bh = BehaviorSubject.createDefault("xie xie");
		bh.subscribe(System.out::println);
		bh.onNext("hello");
		bh.onNext("Hi");
		bh.onNext("Hola");
		bh.subscribe(System.out::println);
		bh.onNext("bye");
		bh.onNext("good night");
		bh.onNext("junhyun please die for me to my health and study RX");
		bh.subscribe(System.out::println);
	}
}
