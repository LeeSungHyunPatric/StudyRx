import java.util.concurrent.TimeUnit;

import javax.swing.plaf.SliderUI;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.observables.ConnectableObservable;

public class SixteenthPractice {
	public static void main (String[] args) {
		String[] dt = {"1","2","3"};
		
		Observable<String> ob = Observable.interval(10l, TimeUnit.MILLISECONDS) // �ð� ������ �ΰ� �����͸� ���� ��
				.map(Long::intValue) // long���� int������ �ٲپ���
				.map(i -> dt[i]) 
				.take(dt.length); // ��� ���������� ���� ���ΰ� ����
		
		ConnectableObservable<String> co = ob.publish();
		co.subscribe(data -> System.out.println("#1 = "+data));
		co.subscribe(data -> System.out.println("#2 = "+data));
		co.connect();
		co.subscribe(data -> System.out.println("#3 = "+data));
	}
}
