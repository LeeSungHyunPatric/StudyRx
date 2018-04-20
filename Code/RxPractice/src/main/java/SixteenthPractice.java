import java.util.concurrent.TimeUnit;

import javax.swing.plaf.SliderUI;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.observables.ConnectableObservable;

public class SixteenthPractice {
	public static void main (String[] args) {
		String[] dt = {"1","2","3"};
		
		Observable<String> ob = Observable.interval(10l, TimeUnit.MILLISECONDS) // 시간 간격을 두고 데이터를 발행 함
				.map(Long::intValue) // long형은 int형으로 바꾸어줌
				.map(i -> dt[i]) 
				.take(dt.length); // 몇개를 가져올지에 관한 것인것 같다
		
		ConnectableObservable<String> co = ob.publish();
		co.subscribe(data -> System.out.println("#1 = "+data));
		co.subscribe(data -> System.out.println("#2 = "+data));
		co.connect();
		co.subscribe(data -> System.out.println("#3 = "+data));
	}
}
