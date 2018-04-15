import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import io.reactivex.Observable;

//2018 4 15 Future�� fromxxx�� �̿��ؼ� �ϱ�

public class EighthPractice {
	public static void main(String[] args) {
		Future<String> future = Executors.newSingleThreadExecutor().submit(() -> {Thread.sleep(1000); return "Hello";});
		
		Observable.fromFuture(future).subscribe(System.out::println);
	}
}
