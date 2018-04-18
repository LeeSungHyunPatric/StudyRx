import java.lang.reflect.Array;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.internal.operators.observable.ObservableAll;

// 2018 4 16 Observable<���� Ÿ��>

public class TenthPractice {
	public static void main (String[] args) {
		Observable<String> ob = Observable.just("Hello, World");
		Single<String> si = Single.fromObservable(ob);
		si.subscribe(System.out::println);
		
		String[] array = {"Hello", "Hu", "sadjk"}; // ���� �߻� Single�� �Ѱ��� �����͸��� �����ϰ� ���� onNextȣ�� �Ұ���
		Observable.fromArray(array).single("Hello World").
		subscribe(System.out::println);
	}
}
