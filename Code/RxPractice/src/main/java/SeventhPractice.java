import java.util.concurrent.Callable;

import javax.swing.plaf.SliderUI;

import io.reactivex.Observable;

// 2018 4 15 Callbee �񵿱� �ý��ۿ� ���� �н� �� RX������ �񵿱� ó�� ���

public class SeventhPractice {
	
	public static void main(String[] args) {
		Callable<String> callable = () -> {
			Thread.sleep(1000);
			return "Hello, World";
		};
		
		Observable.fromCallable(callable).subscribe(System.out::println);
	}
}
