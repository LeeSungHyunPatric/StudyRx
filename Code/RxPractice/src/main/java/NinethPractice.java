import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import com.google.common.eventbus.Subscribe;

import io.reactivex.Observable;
import io.reactivex.exceptions.OnErrorNotImplementedException;

//2018 4 16 
//자바 9부터 Flow API 에서 지원되는 Publisher 객체를 넣는 방법 

public class NinethPractice {
	public static void main (String[] args) {
		Publisher<String> publisher = (Subscriber <? super String> s) -> {
			s.onNext("Hello, World");
			s.onComplete();
		};
		
		Observable.fromPublisher(publisher).subscribe(System.out::println);
	}
}
