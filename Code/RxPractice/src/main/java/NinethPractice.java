import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import com.google.common.eventbus.Subscribe;

import io.reactivex.Observable;
import io.reactivex.exceptions.OnErrorNotImplementedException;

//2018 4 16 
//�ڹ� 9���� Flow API ���� �����Ǵ� Publisher ��ü�� �ִ� ��� 

public class NinethPractice {
	public static void main (String[] args) {
		Publisher<String> publisher = (Subscriber <? super String> s) -> {
			s.onNext("Hello, World");
			s.onComplete();
		};
		
		Observable.fromPublisher(publisher).subscribe(System.out::println);
	}
}
